/**
 * This class demonstrates the usage of various primitive data types in Java.
 * It initializes variables of different data types with the same numeric value
 * and prints them to the standard error stream.
 *
 * Note:
 * - `char` is a single 16-bit Unicode character.
 * - `int` is a 32-bit signed integer.
 * - `byte` is an 8-bit signed integer.
 * - `short` is a 16-bit signed integer.
 * - `double` is a double-precision 64-bit floating point.
 * - `float` is a single-precision 32-bit floating point.
 * - `long` is a 64-bit signed integer.
 */
public class datatype {
    public static void main(String[] args) {
        char ch = 'A';
        int num = 65;
        byte b = 65;
        short s = 65;
        double d = 65.0;
        float f = 65.0f;
        long l = 65554;

        System.err.println("Character: " + ch);
        System.err.println("Integer: " + num);
        System.err.println("Byte: " + b);
        System.err.println("Short: " + s);
        System.err.println("Double: " + d);
        System.err.println("Float: " + f);
        System.err.println("Long: " + l);
    }
}