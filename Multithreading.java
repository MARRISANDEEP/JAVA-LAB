## Experiment 7: Multithreading in Java

### Aim

To write a Java program to demonstrate multithreading by creating and running two or more threads simultaneously.

### Algorithm

1. Start the program.
2. Create a class named `MyThread` that inherits the `Thread` class.
3. Override the `run()` method to specify the task performed by each thread.
4. Create another class named `Multithreading` containing the `main()` method.
5. Create two objects of the `MyThread` class.
6. Assign names to the threads using the `setName()` method.
7. Start both threads using the `start()` method.
8. Allow both threads to execute concurrently.
9. Stop the program.

### Program

java

```java
class MyThread extends Thread
{
    // Override the run() method
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName()
                    + " - Count: " + i);
        }
    }
}

public class Multithreading
{
    public static void main(String[] args)
    {
        // Create two thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Assign names to threads
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        // Start both threads
        t1.start();
        t2.start();
    }
}
```

.

### Result

Thus, the Java program to demonstrate multithreading by creating and executing multiple threads using the `Thread` class was successfully implemented and executed.
