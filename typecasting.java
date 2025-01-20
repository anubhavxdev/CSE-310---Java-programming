/**
 * This class demonstrates various types of typecasting in Java.
 */
public class typecasting {

    /**
     * The main method where typecasting examples are demonstrated.
     *
     * @param args Command line arguments
     */
    public static void main(String args []) {
        // Implicit typecasting (widening conversion)
        int a = 15;
        int b = 10;
        int c = a / b; // Integer division

        float d = 15;
        float e = 10;
        float f = d / e; // Floating-point division

        // Explicit typecasting (narrowing conversion)
        float g = 15;
        float h = 10;
        int i = (int) g / (int) h; // Casting float to int before division

        // Implicit typecasting (widening conversion)
        int j = 15;
        int k = 10;
        float l = j / k; // Integer division, result implicitly cast to float

        System.err.println("Result: " + c); // Output: Result of integer division
        System.err.println("Result: " + f); // Output: Result of floating-point division
        System.err.println("Result: " + i); // Output: Result of integer division after explicit casting
        System.err.println("Result: " + l); // Output: Result of integer division cast to float
    }
}