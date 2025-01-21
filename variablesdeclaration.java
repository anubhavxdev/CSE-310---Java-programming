/**
 * The {@code variablesdeclaration} class demonstrates the use of instance, static, and local variables in Java.
 * <p>
 * This class contains:
 * <ul>
 *   <li>An instance variable {@code instanceVar}</li>
 *   <li>A static variable {@code staticVar}</li>
 *   <li>A method {@code display()} that declares a local variable {@code localVar} and prints all three variables</li>
 * </ul>
 * </p>
 */
public class variablesdeclaration {
    int instanceVar = 10;
    static int staticVar = 20;
    public void display() {
        int localVar = 30;
        System.err.println("Instance Variable: " + instanceVar);
        System.err.println("Static Variable: " + staticVar);
        System.err.println("Local Variable: " + localVar);
    }
}
