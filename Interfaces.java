/*
An interface is a reference type in Java. It is similar to class. It is a collection
of abstract methods. A class implements an interface, thereby inheriting
the abstract methods of the interface.

Along with abstract methods, an interface may also contain constants, default methods,
static methods, and nested types. Method bodies exist only for default methods and static methods.

Writing an interface is similar to writing a class. But a class describes the attributes
and behaviors of an object. And an interface contains behaviors that a class implements.

Unless the class that implements the interface is abstract, all the methods of the
interface need to be defined in the class.

An interface is similar to a class in the following ways:

    - An interface can contain any number of methods.
    - An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.
    - The byte code of an interface appears in a .class file.
    - Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.

Interfaces have the following properties:

    - An interface is implicitly abstract. You do not need to use the abstract
      keyword while declaring an interface.
    - Each method in an interface is also implicitly abstract, so the abstract
      keyword is not needed.
    - Methods in an interface are implicitly public.

When implementation interfaces, there are several rules:

    - A class can implement more than one interface at a time.
    - A class can extend only one class, but implement many interfaces.
    - An interface can extend another interface, in a similar way as a class can extend another class.

    Tagging Interfaces
    The most common use of extending interfaces occurs when the parent interface
    does not contain any methods.

    An interface with no methods in it is referred to as a tagging interface.
*/
interface Animal {
    public void eat();
    public void travel();
}

interface Dog extends Animal{
    public void eat2();
    public void travel2();
}

interface Cat extends Animal{
    public void eat3();
    public void travel3();
}

interface Pet extends Cat, Dog{
    public void eat4();
    public void trave4();
}

interface EventListener{}//Tagged Interface

public class Interfaces implements Animal{

    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String args[]) {
        Interfaces m = new Interfaces();
        m.eat();
        m.travel();
    }
}
