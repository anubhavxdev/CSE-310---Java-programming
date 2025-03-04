// public class practice {
//     private int value;

//     public practice() {
//         this.value = 0;
//     }

//     public practice(int value) {
//         this.value = value;
//     }

//     public practice(String value) {
//         this.value = Integer.parseInt(value);05
//     }

//     public void display() {
//         System.out.println("Value: " + this.value);
//     }

//     public void display(String message) {
//         System.out.println(message + ": " + this.value);
//     }

//     public void display(int increment) {
//         System.out.println("Value after increment: " + (this.value + increment));
//     }

//     public static void main(String[] args) {
//         practice obj1 = new practice();
//         practice obj2 = new practice(10);
//         practice obj3 = new practice("20");

//         obj1.display();
//         obj2.display("Current value");
//         obj3.display(5);

//         SubClass1 subObj1 = new SubClass1(30);
//         subObj1.display();
//         subObj1.display("SubClass1 value");

//         SubClass2 subObj2 = new SubClass2("40");
//         subObj2.display();
//         subObj2.display(10);
//     }
// }

// class SubClass1 extends practice {
//     public SubClass1(int value) {
//         super(value);
//     }

//     @Override
//     public void display() {
//         System.out.println("SubClass1 Value: " + super.value);
//     }
// }

// class SubClass2 extends practice {
//     public SubClass2(String value) {
//         super(value);
//     }

//     @Override
//     public void display() {
//         System.out.println("SubClass2 Value: " + super.value);
//     }
// }
