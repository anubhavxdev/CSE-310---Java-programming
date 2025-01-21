// /**
//  * This class demonstrates various types of typecasting in Java.
//  */
// public class typecasting {

//     /**
//      * The main method where typecasting examples are demonstrated.
//      *
//      * @param args Command line arguments
//      */
//     public static void main(String args []) {
//         // Implicit typecasting (widening conversion)
//         int a = 15;
//         int b = 10;
//         int c = a / b; // Integer division

//         float d = 15;
//         float e = 10;
//         float f = d / e; // Floating-point division

//         // Explicit typecasting (narrowing conversion)
//         float g = 15;
//         float h = 10;
//         int i = (int) g / (int) h; // Casting float to int before division

//         // Implicit typecasting (widening conversion)
//         int j = 15;
//         int k = 10;
//         float l = j / k; // Integer division, result implicitly cast to float

//         System.err.println("Result: " + c); // Output: Result of integer division
//         System.err.println("Result: " + f); // Output: Result of floating-point division
//         System.err.println("Result: " + i); // Output: Result of integer division after explicit casting
//         System.err.println("Result: " + l); // Output: Result of integer division cast to float
//     }
// }



/**
 * This class demonstrates typecasting in Java.
 * Typecasting is the process of converting one data type into another.
 * In this example, we are converting an int to a long, and then a long to a float.
 */
public class typecasting {

    /**
     * The main method is the entry point of the program.
     * It performs the typecasting operations and prints the results.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Declare an integer variable and initialize it with a value of 10
        int x = 10;

        // Implicitly cast the integer to a long
        long y = x;

        // Implicitly cast the long to a float
        float z = y;

        // Declare a double variable and initialize it with a value of 259.41
        double d = 259.41;

        // Explicitly cast the double to a long
        long l = (long) d;

        // Explicitly cast the long to an int
        int i = (int) l;

        // Print the original double value
        System.err.println("Double value " + d);

        // Print the value after converting to long
        System.err.println("Long value " + l);

        // Print the value after converting to int
        System.err.println("Int value " + i);
        // Print the original integer value
        System.err.println("Before Conversion, int value " + x);

        // Print the value after converting to long
        System.err.println("After conversion, long value " + y);

        // Print the value after converting to float
        System.err.println("After Conversion, float value " + z);
    }
}