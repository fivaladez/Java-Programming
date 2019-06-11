public class Numbers {

    public static void main(String args[]) {
        Integer x = 5; // boxes int to an Integer object
        x =  x + 10;   // unboxes the Integer to a int
        System.out.println(x);

        // Returns byte primitive data type
        System.out.println( x.byteValue() );
        // Returns double primitive data type
        System.out.println(x.doubleValue());
        // Returns long primitive data type
        System.out.println( x.longValue() );

        /* Returns: 0->equal, -1->less than, 1->greater than*/
        System.out.println(x.compareTo(3));
        System.out.println(x.compareTo(5));
        System.out.println(x.compareTo(8));

        x = 5;
        Integer y = 10;
        Integer z =5;
        Short a = 5;
        /* Returns True or False*/
        System.out.println(x.equals(y));
        System.out.println(x.equals(z));
        System.out.println(x.equals(a));

        /* Returns an Integer object holding the value of the specified primitive. */
        Integer x1 =Integer.valueOf(9);
        Double c1 = Double.valueOf(5);
        Float a1 = Float.valueOf("80");
        Integer b1 = Integer.valueOf("444",16);
        System.out.println(x1);
        System.out.println(c1);
        System.out.println(a1);
        System.out.println(b1);

        /* String object representing the value of this Integer. */
        System.out.println(x.toString());
        /* returns a String object representing the specified integer. */
        System.out.println(Integer.toString(12));

        /* Returns an integer, given a string representation of decimal, binary, octal, or hexadecimal  */
        int x2 =Integer.parseInt("9");
        double c2 = Double.parseDouble("5");
        int b2 = Integer.parseInt("444",16);
        System.out.println(x2);
        System.out.println(c2);
        System.out.println(b2);

        Integer a3 = -8;
        double d3 = -100;
        float f3 = -90;
        System.out.println(Math.abs(a3));
        System.out.println(Math.abs(d3));
        System.out.println(Math.abs(f3));

        double d4 = -100.675;
        float f4 = -90;
        System.out.println(Math.ceil(d4));
        System.out.println(Math.ceil(f4));
        System.out.println(Math.floor(d4));
        System.out.println(Math.floor(f4));

        double x5 = 11.635;
        double y5 = 2.76;
        System.out.printf("The value of e is %.4f%n", Math.E);
        System.out.printf("pow(%.3f, %.3f) is %.3f%n", x5, y5, Math.pow(x5, y5));

        System.out.println( Math.random() );
    }
}
