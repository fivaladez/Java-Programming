public class BasicOperations {

   public static void main(String args[]) {
      int a, b;
      a = 10;
      b = (a == 1) ? 20: 30;

      System.out.println( "Value of b is : " +  b );

      b = (a == 10) ? 20: 30;
      System.out.println( "Value of b is : " + b );

      BasicOperations c = new BasicOperations();
      boolean result =  c instanceof BasicOperations;
      System.out.println( result );

      double d = a + b;
      System.out.println( d );
      d = b - a;
      System.out.println( d );
      d = b * a;
      System.out.println( d );
      d = b / a;
      System.out.println( d );
      d = b | a;
      System.out.println( d );
      d = b & a;
      System.out.println( d );
      d = b ^ a;
      System.out.println( d );
      d = ~a;
      System.out.println( d );
      d = 3<<2;//Move 0011 two positions left
      System.out.println( d );
      d = 3>>2;//Move 0011 two positions right
      System.out.println( d );

   }
}
