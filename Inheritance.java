/*
Inheritance
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another.
 With the use of inheritance the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, child class)
and the class whose properties are inherited is known as superclass (base class, parent class).

extends Keyword
extends is the keyword used to inherit the properties of a class.

Note − A subclass inherits all the members (fields, methods, and nested classes) from its superclass.
Constructors are not members, so they are not inherited by subclasses, but the constructor of the
superclass can be invoked from the subclass.

The super keyword
The super keyword is similar to this keyword. Following are the scenarios where the super keyword is used.
It is used to differentiate the members of superclass from the members of subclass, if they have same names.
It is used to invoke the superclass constructor from subclass.

Invoking Superclass Constructor
If a class is inheriting the properties of another class, the subclass automatically acquires the
default constructor of the superclass. But if you want to call a parameterized constructor of the
superclass, you need to use the super keyword.
*/
class Calculation {
   int z = 2;
   int num = 30;

   Calculation(int num){
       this.num = num;
   }
   public void addition(int x, int y) {
      z = x + y;
      System.out.println("The sum of the given numbers:"+z);
   }

   public void Subtraction(int x, int y) {
      z = x - y;
      System.out.println("The difference between the given numbers:"+z);
   }

   // display method of superclass
   public void display() {
      System.out.println("This is the display method of superclass");
   }
}

public class Inheritance extends Calculation {
    int num = 10;

   Inheritance(int num){
       super(num);//Invoke super class constructor
   }
   public void multiplication(int x, int y) {
      z = x * y;
      System.out.println("The product of the given numbers:"+z);
   }

   // display method of sub class
   public void display() {
      System.out.println("This is the display method of subclass");
   }

   public void my_method() {
      // Instantiating subclass
      Inheritance sub = new Inheritance(4);

      // Invoking the display() method of sub class
      sub.display();

      // Invoking the display() method of superclass
      super.display();

      // printing the value of variable num of subclass
      System.out.println("value of the variable named num in sub class:"+ sub.num);

      // printing the value of variable num of superclass
      System.out.println("value of the variable named num in super class:"+ super.num);
   }

   public static void main(String args[]) {
      int a = 20, b = 10;
      Inheritance demo = new Inheritance(2);
      demo.addition(a, b);
      demo.Subtraction(a, b);
      demo.multiplication(a, b);
      demo.my_method();
   }
}
