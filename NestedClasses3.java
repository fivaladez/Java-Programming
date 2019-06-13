/*
Anonymous Inner Class
An inner class declared without a class name is known as an anonymous inner class.
In case of anonymous inner classes, we declare and instantiate them at the same time.
Generally, they are used whenever you need to override the method of a class or an interface.
*/
abstract class AnonymousInner {
   public abstract void mymethod();
}

public class NestedClasses3 {

   public static void main(String args[]) {
      AnonymousInner inner = new AnonymousInner() {
         public void mymethod() {
            System.out.println("This is an example of anonymous inner class");
         }
      };
      inner.mymethod();
   }
}
