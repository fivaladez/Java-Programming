/*
Static Nested Class
A static inner class is a nested class which is a static member of the outer class.
It can be accessed without instantiating the outer class, using other static members.
Just like static members, a static nested class does not have access to the instance variables and methods of the outer class.
*/
public class NestedClasses4 {
   static class Nested_Demo {//Static nested class
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }

   public static void main(String args[]) {
      Outer.Nested_Demo nested = new Outer.Nested_Demo();
      nested.my_method();
   }
}
