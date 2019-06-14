/*
Polymorphism
is the ability of an object to take on many forms. The most common use of polymorphism in OOP
occurs when a parent class reference is used to refer to a child class object.
*/
class SuperClass {

    public void message ( String msg ){
        System.out.println("The message received in Super Class is: " + msg);
    }

}

class SubClass extends SuperClass {

    public void message ( String msg ){
        System.out.println("The message received in Sub Class is: " + msg);
    }

}

public class Polymorphism {

    public static void main (String args[]){
        SuperClass a = new SuperClass();
        SuperClass b = new SubClass();

        a.message("Hello");
        b.message("Good bye");

    }
}
