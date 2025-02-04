// public class array {
//     public static void main(String[] args) {
//         int[] arr = new int[5];
//         arr[0] = 10;
//         arr[1] = 20;
//         arr[2] = 30;
//         arr[3] = 40;
//         arr[4] = 50;
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }

// public class array {
//     public static void main(String[] args) {
//         int a[]={33,3,4,5};
//         for(int i=0;i<a.length;i++){
//             System.out.println(a[i] + " ");
//         }
//     }
// }

// public class array {

//     public static void main(String[] args) {
//         int [][] arr=new int[3][3];
//         arr[0][0]=1;
//         System.out.println("arr[0][0] = "+arr[0][0]);
//     }
// }

// public class array {

//     public static void main(String[] args) {
//         int [][][] arr={{{1,2}, {2,3}} , {{3,4}, {5,6}}};
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 for(int k=0;k<arr[i][j].length;k++){
//                     System.out.println(arr[i][j][k]);
//                 }
//             }
//         }
//     }
// }


// import java.util.Scanner;
// public class array{
//     public static void main(String[] args) {c
//         Scanner Scanner = new Scanner(System.in);
//         int size = Scanner.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=Scanner.nextInt();
//         }
//         System.out.print("Array elements are: ");
//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]);
//         }
//         Scanner.close();
//     }
// }


// public class array {

//     public static void main(String[] args) {
//         int [] arr={1,2,3,4,5};
//         int sum=0;
//         for(int element:arr){
//             sum+=element;
//             System.out.println("Sum of array elements is: "+sum);
//         }
//     }
// }


// public class array {

//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//         System.out.println(matrix[2][0]);
//     }
// }


// public class array {

//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};

//         for(int i=0; i<matrix.length; i++){
//             for(int j=0; j<matrix[i].length; j++){
//                 System.out.println(matrix[i][j]);
//             }
//         }
//     }
// }



// import java.util.Scanner;
// public class array {

//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
//         int size = Scanner.nextInt();
//         int[] arr = new int[size];
//         for(int i=0;i<size;i++){
//             arr[i]=Scanner.nextInt();
//         }
//         System.out.print("Array elements are: ");
//         for(int i=0;i<size;i++){
//             System.out.println(arr[i]);
//         }
//         Scanner.close();
//     }
// }



//new 

// public class array {
//     public int sumNumber(int a, int b){
//         return a+b;
//     }
//     public int sumNumber(int a,int b, int c){
//         return a+b+c;
//     }
//     public static void main(String[] args) {
//         array obj = new array();
//         System.out.println(obj.sumNumber(1, 2, 3));
//         System.out.println(obj.sumNumber(1, 2));
//     }
// }