/*
in Object-oriented programming, abstraction is a process of hiding the implementation details from
the user, only the functionality will be provided to the user. In other words, the user will have
the information on what the object does instead of how it does it.


Abstract Class
A class which contains the abstract keyword in its declaration is known as abstract class.

    - Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
    - But, if a class has at least one abstract method, then the class must be declared abstract.
    - If a class is declared abstract, it cannot be instantiated.
    - To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
    - If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
*/
public class Abstraction {

    public static void main (String args[]){
        SubClass a = new SubClass();
        SuperClass b = new SubClass();

        a.message("A reference to SubClass");
        b.message("A reference to SuperClass");
        a.print("Whats up!");
        b.print("Hey due!");

    }
}
abstract class SuperClass {

    public void message ( String msg ){
        System.out.println("The message received in Super Class is: " + msg);
    }

    public void print ( String msg){
        System.out.println("The message to print in Super Class is: " + msg);
    }

}

class SubClass extends SuperClass {

    public void message ( String msg ){
        System.out.println("The message received in Sub Class is: " + msg);
    }

}
