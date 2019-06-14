/*
Overriding: to override the functionality of an existing method.

*/
class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      super.move();   // invokes the super class method
      System.out.println("Dogs can walk and run");
   }

   public void bark() {
      System.out.println("Dogs can bark");
   }
}

public class Overriding {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      // This line cause an ERROR b.bark();
   }
}
