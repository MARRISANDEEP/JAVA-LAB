## Experiment: Reading a File Using FileReader

### Aim

To write a Java program to read and display the contents of a text file using the `FileReader` class.

### Algorithm

1. Start the program.
2. Import the `java.io` package.
3. Create a `FileReader` object to open the file `sample2.txt`.
4. Declare an integer variable to store the characters read from the file.
5. Use the `read()` method to read the file one character at a time.
6. Repeat the reading process until the end of the file is reached, indicated by `-1`.
7. Display each character on the console using `System.out.print()`.
8. Close the file using the `close()` method.
9. Handle any input/output exceptions using a `try-catch` block.
10. Stop the program.

### Program

java

```java
import java.io.*;

public class Filereader
{
    public static void main(String[] args)
    {
        try
        {
            // Create a FileReader object
            FileReader fr = new FileReader("sample2.txt");

            // Declare an integer variable
            int i;

            // Read and display file contents
            while ((i = fr.read()) != -1)
            {
                System.out.print((char) i);
            }

            // Close the file
            fr.close();
        }
        catch (IOException e)
        {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```


```

### Result

Thus, the Java program to read and display the contents of a text file using the `FileReader` class was successfully implemented and executed.
