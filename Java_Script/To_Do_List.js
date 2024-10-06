document.addEventListener('DOMContentLoaded', function () {
    const taskInput = document.getElementById('taskInput');
    const addTaskButton = document.getElementById('addTaskButton');
    const taskList = document.getElementById('taskList');
    const taskCount = document.getElementById('taskCount');
    const clearAllButton = document.getElementById('clearAllButton');
    loadTasks();
    addTaskButton.addEventListener('click', addTask);
    clearAllButton.addEventListener('click', clearAllTasks);
    document.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            addTask();
        }
    });
    function addTask() {
        const taskText = taskInput.value.trim();
        if (taskText === '') {
            alert('Please enter a task!');
            return;
        }
        const li = document.createElement('li');
        li.textContent = taskText;
        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'Delete';
        deleteButton.addEventListener('click', function () {
            deleteTask(li);
        });
        li.appendChild(deleteButton);
        li.addEventListener('click', function () {
            li.classList.toggle('completed');
        });
        const isOdd = (taskList.children.length % 2 === 0);
        li.style.backgroundColor = isOdd ? '#f9f9f9' : '#e9e9e9';
        taskList.appendChild(li);
        taskInput.value = '';
        updateTaskCount();
        saveTasks();
    }
    function deleteTask(taskItem) {
        taskList.removeChild(taskItem);
        updateTaskCount();
        saveTasks();
    }
    function clearAllTasks() {
        if (confirm('Are you sure you want to clear all tasks?')) {
            taskList.innerHTML = '';
            updateTaskCount();
            saveTasks();
        }
    }
    function updateTaskCount() {
        taskCount.textContent = `Total Tasks: ${taskList.children.length}`;
    }
    function saveTasks() {
        const tasks = [];
        for (let i = 0; i < taskList.children.length; i++) {
            const task = taskList.children[i].textContent.replace('Delete', '').trim();
            const isCompleted = taskList.children[i].classList.contains('completed');
            tasks.push({ task, isCompleted });
        }
        localStorage.setItem('tasks', JSON.stringify(tasks));
    }
    function loadTasks() {
        const tasks = JSON.parse(localStorage.getItem('tasks')) || [];
        tasks.forEach(({ task, isCompleted }) => {
            const li = document.createElement('li');
            li.textContent = task;
            const deleteButton = document.createElement('button');
            deleteButton.textContent = 'Delete';
            deleteButton.addEventListener('click', function () {
                deleteTask(li);
            });
            li.appendChild(deleteButton);
            if (isCompleted) {
                li.classList.add('completed');
            }
            const isOdd = (taskList.children.length % 2 === 0);
            li.style.backgroundColor = isOdd ? '#f9f9f9' : '#e9e9e9';
            taskList.appendChild(li);
        });
        updateTaskCount();
    }
});