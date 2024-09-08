// Get the form and error message elements
const form = document.getElementById('userForm');
const errorMessages = document.getElementById('errorMessages');
const userInfo = document.getElementById('userInfo');

// Add an event listener to the form submission
form.addEventListener('submit', (e) => {
    e.preventDefault();

    // Get the form data
    const name = document.getElementById('name').value;
    const email = document.getElementById('email').value;
    const age = document.getElementById('age').value;
    const gender = document.querySelector('input[name="gender"]:checked').value;
    const country = document.getElementById('country').value;
    const subscribe = document.getElementById('subscribe').checked;
    const comments = document.getElementById('comments').value;

    // Validate the form data
    let errors = [];
    if (name === '') {
        errors.push('Name is required');
    }
    if (email === '') {
        errors.push('Email is required');
    }
    if (age === '') {
        errors.push('Age is required');
    }
    if (gender === '') {
        errors.push('Gender is required');
    }
    if (country === '') {
        errors.push('Country is required');
    }

    // Display error messages if any
    if (errors.length > 0) {
        errorMessages.innerHTML = '';
        errors.forEach((error) => {
            const errorElement = document.createElement('p');
            errorElement.textContent = error;
            errorMessages.appendChild(errorElement);
        });
    } else {
        // Display user information
        errorMessages.innerHTML = '';
        userInfo.innerHTML = `
            <h2>User Information</h2>
            <p>Name: ${name}</p>
            <p>Email: ${email}</p>
            <p>Age: ${age}</p>
            <p>Gender: ${gender}</p>
            <p>Country: ${country}</p>
            <p>Subscribe to Newsletter: ${subscribe ? 'Yes' : 'No'}</p>
            <p>Comments: ${comments}</p>
        `;
    }
});