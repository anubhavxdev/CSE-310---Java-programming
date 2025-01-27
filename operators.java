/**
 * The operators class demonstrates the use of various arithmetic operators in Java.
 * It performs addition, subtraction, multiplication, division, and modulus operations
 * on integer variables and prints the results to the console.
 * 
 * The following operations are demonstrated:
 * - Addition: a + b
 * - Subtraction: a - b
 * - Multiplication: a * b
 * - Division: b / a
 * - Modulus: b % a, c % a
 * - Post-increment: a++
 * - Post-decrement: a--
 * - Post-increment: d++
 * - Pre-increment: ++d
 * 
 * The results of these operations are printed to the console.
 */
public class operators {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        
        System.out.print("Enter value for d: ");
        int d = scanner.nextInt();
        
        scanner.close();
        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("b--   = " +  (a--) );
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        // Ternary operator to find the maximum of a and b
        int max = (a > b) ? a : b;
        System.out.println("The maximum of a and b is: " + max);


        // Logical operators
        boolean andResult = (a > b) && (c > d);
        boolean orResult = (a > b) || (c > d);
        boolean notResult = !(a > b);

        System.out.println("Logical AND (a > b && c > d) = " + andResult);
        System.out.println("Logical OR (a > b || c > d) = " + orResult);
        System.out.println("Logical NOT !(a > b) = " + notResult);

        // Relational operators
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));

        // Unary operators
        System.out.println("Unary minus (-a) = " + (-a));
        System.out.println("Unary plus (+a) = " + (+a));
        System.out.println("Bitwise complement (~a) = " + (~a));
        System.out.println("Logical complement (!true) = " + (!true));

        // Assignment operators
        int e = a;
        System.out.println("e = a: " + e);

        e += b;
        System.out.println("e += b: " + e);

        e -= c;
        System.out.println("e -= c: " + e);

        e *= d;
        System.out.println("e *= d: " + e);

        e /= a;
        System.out.println("e /= a: " + e);

        e %= b;
        System.out.println("e %= b: " + e);

        // Bitwise operators
        System.out.println("a & b = " + (a & b)); // Bitwise AND
        System.out.println("a | b = " + (a | b)); // Bitwise OR
        System.out.println("a ^ b = " + (a ^ b)); // Bitwise XOR
        System.out.println("a << 2 = " + (a << 2)); // Left shift
        System.out.println("a >> 2 = " + (a >> 2)); // Right shift
        System.out.println("a >>> 2 = " + (a >>> 2)); // Unsigned right shift

    }
}
