/*
Nested Classes
In Java, just like methods, variables of a class too can have another class as its member.
Writing a class within another is allowed in Java. The class written within is called the nested class,
and the class that holds the inner class is called the outer class.

Nested classes are divided into two types:

    - Non-static nested classes − These are the non-static members of a class.
    - Static nested classes − These are the static members of a class.

Inner Classes (Non-static Nested Classes)
Inner classes are a security mechanism in Java. We know a class cannot be associated with the
access modifier private, but if we have the class as a member of other class, then the inner class
can be made private. And this is also used to access the private members of a class.

Inner classes are of three types depending on how and where you define them. They are:
    - Inner Class
    - Method-local Inner Class
    - Anonymous Inner Class
*/
class Outer_Demo {
    // private variable of the outer class
    private int num = 175;

   // inner class
   private class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }

   // inner class
   public class Inner_Demo2 {
      public int getNum() {
         System.out.println("This is the getnum method of the inner class 2");
         return num;
      }
   }

   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}

public class NestedClasses1 {

   public static void main(String args[]) {
      // Instantiating the outer class
      Outer_Demo outer = new Outer_Demo();

      // Accessing the display_Inner() method.
      outer.display_Inner();

      // Instantiating the inner class
      Outer_Demo.Inner_Demo2 inner = outer.new Inner_Demo2();
      System.out.println(inner.getNum());
   }
}
