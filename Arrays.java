public class Arrays{
/*
Arrays
It is a collection of variables of the same type.
*/
    public static void main (String args[]){
        /*Declaring*/
        double[] myList;   // preferred way. Java style
        double myList2[];   // works but not preferred way. C++ style
        /*Creating*/
        double[] myList3 = new double[10];
        double[] myList4 = {0,1,2,3,4,5,6,7,8,9};
        /*Processing*/
        // Print all the array elements
        for (int i = 0; i < myList4.length; i++) {
            System.out.println(myList4[i] + " ");
        }

        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList4.length; i++) {
            total += myList4[i];
        }
        System.out.println("Total is " + total);

        // Finding the largest element
        double max = myList4[0];
        for (int i = 1; i < myList4.length; i++) {
            if (myList4[i] > max) max = myList4[i];
        }
        System.out.println("Max is " + max);

        // Print all the array elements with a foreach Loops
        for (double element: myList4) {
            System.out.println(element);
        }

        printArray(myList4);

        myList4 = reverse(myList4);
        printArray(myList4);

    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static double[] reverse(double[] list) {
        double[] result = new double[list.length];

        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }

}
