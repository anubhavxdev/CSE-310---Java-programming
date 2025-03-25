// public class Outer {
//     static class Nested {
//         void display() {
//             System.out.println("This is a nested class.");
//         }
//     }

//     public static void main(String[] args) {
//         Nested obj = new Nested(); // Correct way to instantiate static nested class
//         obj.display();
//     }
// }

// public class Outer {

//     static class StaticNested {  // Corrected class definition
//         void print() {
//             System.out.println("This is a static nested class.");
//         }
//     }

//     public static void main(String[] args) {
//         StaticNested obj = new StaticNested(); // Correct way to instantiate static nested class
//         obj.print();
//     }
// }


// class outer {
//     int instanceVar = 10; // instance variable of outer class
//     class Inner {
//         void print() {
//             System.out.println("Instance variable of outer class: " + instanceVar);
//         }
//     }

//     public static void main(String[] args) {
//         outer obj = new outer(); // Create an instance of the outer class
//         Inner innerObj = obj.new Inner(); // Create an instance of the inner class
//         innerObj.print(); // Call the method of the inner class
//     }
// }


class outerclass {
    void outermethod() {
        class localclass {
            void localmethod() {
                System.out.println("This is a method of the local class.");
            }
        }
        localclass obj = new localclass(); // Create an instance of the local class
        obj.localmethod(); // Call the method of the local class
    }
    public static void main(String[] args) {
        outerclass obj = new outerclass(); // Create an instance of the outer class
        obj.outermethod(); // Call the method of the outer class
        // localclass obj2 = new localclass(); // This line would cause an error because localclass is not visible here
    }
}
