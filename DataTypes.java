/*
* There are two data types available in Java −
*   - Primitive Data Types
*   - Reference/Object Data Types
*/
public class DataTypes {
    /* Primitive Data Types */
    byte byteVar = -128;
    short shortVar = -32768;
    int intVar = -2147483648;
    long longVar = -2147483648;
    float floatVar = 123.5f;
    double doubleVar = 12300.5;
    boolean booleanVar = true;
    char charVar = 'A';

    public static void main(String args[]) {
        /* Reference/Object Data Types */
        DataTypes DT1 = new DataTypes();
        DataTypes DT2 = new DataTypes();
        System.out.println(DT1.booleanVar + " " + DT2.byteVar);

    }
}
