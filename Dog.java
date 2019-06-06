public class Dog {
   String breed;//Instance variables
   int age;
   String color = "brown";

   static int count;//Class variable

   public Dog(){//Regular contructor
       /* It MUST be called the same that the class name*/
       System.out.println(" This line shall not be printed");
   }

   public Dog(String name){
       // This constructor has one parameter, name.
       System.out.println("Passed Name is :" + name );
       count++;
       age = 5;
   }

   void barking() {
       int x = 0;//Local variable
       System.out.println(" You are in barking ");
   }

   void hungry() {
   }

   void sleeping() {
   }

   public static void main(String []args) {
        // Following statement would create an object myPuppy
        Dog myDog = new Dog( "tommy" );
        System.out.println("Calling variable color: " + myDog.color);
        myDog.barking();
   }
}
