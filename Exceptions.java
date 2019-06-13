/*
An exception (or exceptional event) is a problem that arises during the execution of a program.
When an Exception occurs the normal flow of the program is disrupted and the program/Application
terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

    - Checked exceptions − A checked exception is an exception that is checked (notified) by the compiler
      at compilation-time, these are also called as compile time exceptions. These exceptions cannot
      simply be ignored, the programmer should take care of (handle) these exceptions.
      File file = new File("E://file.txt");
      FileReader fr = new FileReader(file);

    - Unchecked exceptions − An unchecked exception is an exception that occurs at the time of execution.
      These are also called as Runtime Exceptions. These include programming bugs, such as logic errors
      or improper use of an API. Runtime exceptions are ignored at the time of compilation.
      int num[] = {1, 2, 3, 4};
      System.out.println(num[5]);

    - Errors − These are not exceptions at all, but problems that arise beyond the control of the user
      or the programmer. Errors are typically ignored in your code because you can rarely do anything
      about an error. For example, if a stack overflow occurs, an error will arise. They are also
      ignored at the time of compilation.

The Throws/Throw keywords
    If a method does not handle a checked exception, the method must declare it using the throws keyword.
    The throws keyword appears at the end of a method's signature.

    You can throw an exception, either a newly instantiated one or an exception that you just caught,
    by using the throw keyword.

    Try to understand the difference between throws and throw keywords, throws is used to postpone
    the handling of a checked exception and throw is used to invoke an exception explicitly.

The Finally block
    The finally block follows a try block or a catch block. A finally block of code always executes,
    irrespective of occurrence of an Exception.

    Using a finally block allows you to run any cleanup-type statements that you want to execute,
    no matter what happens in the protected code.

Try-with-resources
    try-with-resources, also referred as automatic resource management, is a new exception handling
    mechanism that was introduced in Java 7, which automatically closes the resources used within the try catch block.

    To use this statement, you simply need to declare the required resources within the parenthesis,
    and the created resource will be closed automatically at the end of the block.

User-defined Exceptions
    You can create your own exceptions in Java. Keep the following points in mind when writing
    your own exception classes:

    - All exceptions must be a child of Throwable.

    - If you want to write a checked exception that is automatically enforced by the Handle or
      Declare Rule, you need to extend the Exception class.

    - If you want to write a runtime exception, you need to extend the RuntimeException class.
*/
public class Exceptions{

    public static void main (String [] args){
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
        System.out.println("Out of the block");

        try {
            file = new FileInputStream(fileName);
            x = (byte) file.read();
        } catch (IOException i) {
            i.printStackTrace();
            return -1;
        } catch (FileNotFoundException f) // Not valid! {
            f.printStackTrace();
            return -1;
        }

        try(FileReader fr = new FileReader("E://file.txt")) {
            char [] a = new char[50];
            fr.read(a);   // reads the contentto the array
            for(char c : a)
                System.out.print(c);   // prints the characters one by one
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deposit(double amount) throws RemoteException {
        // Method implementation
        throw new RemoteException();
   }
}
