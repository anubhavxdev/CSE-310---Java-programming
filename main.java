// // class sum{
// //     static int add(int a, int b){
// //         return a+b;
// //     }
// //     static double add(double a, double b){
// //         return a+b;
// //     }
// // }
// // public class constructoroverloading {

// //     public static void main(String[] args) {
// //         System.out.println(sum.add(5, 6));
// //         System.out.println(sum.add(5.5, 6.6));
// //     }
// // }

// public class Main {
//     int id;
//     String name;

//     // Default constructor with meaningful values
//     public Main() {
//         this.id = -1;  // Default ID
//         this.name = "Unknown"; // Default Name
//         System.out.println("This is a default constructor");
//     }

//     // Parameterized constructor
//     public Main(int i, String n) {
//         this.id = i;
//         this.name = n;
//     }

//     public static void main(String[] args) {
//         // Using default constructor
//         Main s = new Main();
//         System.out.println("Default Constructor Value: ");
//         System.out.println("Student ID: " + s.id + "\nStudent Name: " + s.name);

//         // Using parameterized constructorj
//         System.out.println("\nParameterized Constructor Value: ");
//         Main student = new Main(1, "John");
//         System.out.println("Student ID: " + student.id + "\nStudent Name: " + student.name);
//     }
// }
