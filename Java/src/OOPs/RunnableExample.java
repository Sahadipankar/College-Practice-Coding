package OOPs;

// Program to illustrate creation of threads using Runnable interface
class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set thread name
    public MyRunnable(String threadName) {
        this.threadName = threadName;
    }

    // The run method contains the code to be executed by the thread
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " is running: Iteration " + i);
                // Sleep for 500 milliseconds
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted!");
        }
        System.out.println(threadName + " has finished execution.");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Creating Runnable instances
        MyRunnable task1 = new MyRunnable("Thread-1");
        MyRunnable task2 = new MyRunnable("Thread-2");

        // Creating Thread instances and passing Runnable objects
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Starting threads
        thread1.start();
        thread2.start();

        // Main thread message
        System.out.println("Main thread has started other threads.");
    }
}
