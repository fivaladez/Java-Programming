public class Loops {

    public static void main(String args[]) {
        int x = 10;

        while( x < 20 ) {
            System.out.print("value of x : " + x + "\n");
            x++;
        }
        System.out.print("  =====   \n\n");

        for(int y = 10; y < 20; y++) {
            System.out.print("value of y : " + y + "\n");
        }
        System.out.print("  =====   \n\n");

        int z = 10;
        do {
            System.out.print("value of z : " + z + "\n");
            z++;
        }while( z < 20 );
        System.out.print("  =====   \n\n");


        for(int a = 10; a < 20; a++)
        {
            if( a == 12 )
            {
                System.out.print("Number 12 skipped \n");
                continue;//Skip printing number 12
            }
            else if( a == 15 )
            {
                System.out.print("Loop terminated \n");
                break;//Get out of the loop
            }
            else
            {
                System.out.print("value of a : " + a + "\n");
            }
        }
        System.out.print("  =====   \n\n");

        /*
        Enhances for loop in Java
            for(declaration : expression) {
                // Statements
            }
        */
        int [] numbers = {10, 20, 30, 40, 50};
        for(int b : numbers ) {
            System.out.print( b );
            System.out.print(",");
        }
        System.out.print("  =====   \n\n");


        String [] names = {"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            System.out.print( name );
            System.out.print(",");
        }
        System.out.print("  =====   \n\n");

    }
}
