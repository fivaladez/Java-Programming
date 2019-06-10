public class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        System.out.println(t1.num + " " + t2.num);

        MyClass t3 = new MyClass( 5 );
        MyClass t4 = new MyClass( 7 );
        System.out.println(t3.num + " " + t4.num);
    }
}

class MyClass {
    int num;
    MyClass() {// No argument Contructor
        num = 100;
    }

    MyClass(int i )
    { // Parameterized Constructor
        num = i;
    }
}
