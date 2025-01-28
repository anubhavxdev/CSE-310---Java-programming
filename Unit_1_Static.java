// // Static Question No. 1

// import java.util.Scanner;

// public class Unit_1_Static {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String deviceName = scanner.nextLine();
//         String status = scanner.nextLine();
//         int modelNumber = scanner.nextInt();

//         System.out.println("Device Name: " + deviceName);
//         System.out.println("Status: " + status);
//         System.out.println("Model Number: " + modelNumber);
//     }
// }


// Static Question No. 5
// import java.util.Scanner;

// public class Unit_1_Static {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter monthly rent: ");
//         int monthlyRent = scanner.nextInt();
//         System.out.print("Enter lease duration (in months): ");
//         int leaseDuration = scanner.nextInt();

//         int totalCost = monthlyRent * leaseDuration;
//         String paymentSuggestion;

//         // Use a switch statement with a mapped value
//         int paymentCase = (totalCost <= 1000) ? 1 : (totalCost <= 5000) ? 2 : 3;

//         switch (paymentCase) {
//             case 1:
//                 paymentSuggestion = "Payment by Cash or Check is recommended.";
//                 break;
//             case 2:
//                 paymentSuggestion = "Payment by credit card is mandatory.";
//                 break;
//             case 3:
//                 paymentSuggestion = "Payment by bank transfer is mandatory.";
//                 break;
//             default:
//                 paymentSuggestion = "Invalid payment case.";
//                 break;
//         }
//         System.out.println("Total Cost: " + totalCost);
//         System.out.println("Payment Method suggestion: " + paymentSuggestion);
//     }
// }



// Static Question 4


import java.util.Scanner;
 public static void main (String[] args){
    Scanner scanner = new scanner(System.in);
    int x1 = scanner.nextInt();
    int x2 = scanner.nextInt();
    int y1 = scanner.nextInt();
    int y2 = scanner.nextInt();
    double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    System.out.println(distance);
 }