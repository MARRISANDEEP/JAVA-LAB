## Experiment 10(a): Multiple Inheritance Using Interfaces in Java

### Aim

To write a Java program to demonstrate multiple inheritance by implementing two interfaces in a single class.

### Algorithm

1. Start the program.
2. Create an interface named `Printable` and declare a method called `print()`.
3. Create another interface named `Showable` and declare a method called `show()`.
4. Create a class named `MultipleInheritance` that implements both interfaces.
5. Define the `print()` and `show()` methods inside the class.
6. Create an object of the `MultipleInheritance` class inside the `main()` method.
7. Invoke both methods using the created object.
8. Display the output on the console.
9. Stop the program.

### Program

java

```java
interface Printable
{
    void print();
}

interface Showable
{
    void show();
}

public class MultipleInheritance implements Printable, Showable
{
    // Implement the print() method
    public void print()
    {
        System.out.println("Print method is executed.");
    }

    // Implement the show() method
    public void show()
    {
        System.out.println("Show method is executed.");
    }

    public static void main(String[] args)
    {
        // Create an object of the class
        MultipleInheritance obj = new MultipleInheritance();

        // Call both methods
        obj.print();
        obj.show();
    }
}
```


### Result

Thus, the Java program to demonstrate multiple inheritance by implementing two interfaces in a single class was successfully implemented and executed.
