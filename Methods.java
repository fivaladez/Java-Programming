public class Methods{

    /* The this keyword
        "this" is a keyword in Java which is used as a reference to the object of the current class,
        with in an instance method or a constructor.
        Using this you can refer the members of a class such as constructors, variables and methods.

        Note − The keyword this is used only within instance methods or constructors

        "this" is used to − Differentiate the instance variables from local variables
        if they have same names, within a constructor or a method.
    */
    int age;
    public Methods(int age){
        this.age = age;
        System.out.println( "You are initializing object 'Methods'. ");
    }

    //Finalize method
    protected void finalize(){
        System.out.println("This object has been destroyed.");
    }

    public static void main(String[] args) {

        //Using Command Line
        for(int i = 0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " +  args[i]);
        }

        //OVERLOADING
        int a = 11, b = 6;
        double c = 7.3, d = 9.4;
        int result1 = minFunction(a, b);
        double result2 = minFunction(c, d); // same function name with different parameters
        System.out.println("Minimum Value = " + result1);
        System.out.println("Minimum Value = " + result2);

        // Call method with Variable Arguments
	    printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});

        Methods mtds = new Methods(5);

    }

    // for integer
    public static int minFunction(int n1, int n2) {
        int min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }

    // for double
    public static double minFunction(double n1, double n2) {
        double min;
        if (n1 > n2) min = n2;
        else min = n1;
        return min;
    }

    //Variable arguments
    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
        }else{
            double result = numbers[0];
            for (int i = 1; i <  numbers.length; i++){
                if (numbers[i] >  result){
                    result = numbers[i];
                }
            }
            System.out.println("The max value is " + result);
        }

    }

}
