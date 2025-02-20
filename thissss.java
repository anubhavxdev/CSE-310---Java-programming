// public class thissss {
//     int a;
//     int b;

//     thissss() {
//         this(0, 0); 
//     }

//     thissss(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     void display() {
//         System.out.println("a = " + a + " b = " + b);
//     }

//     public static void main(String[] args) {
//         thissss obj1 = new thissss(10, 20);
//         obj1.display();

//         thissss obj2 = new thissss(); 
//         obj2.display();
//     }
// }



// public class thissss {
//     int a;
//     int b;

//     thissss() {
//         this(0, 0); 
//     }

//     thissss(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     thissss getInstance() {
//         return this;
//     }

//     void display() {
//         System.out.println("a = " + a + " b = " + b);
//     }

//     public static void main(String[] args) {
//         thissss obj1 = new thissss(10, 20);
//         obj1.display();

//         thissss obj2 = new thissss(); 
//         obj2.display();

//         thissss obj3 = obj1.getInstance();
//         obj3.display();
//     }
// }



// public class thissss {
//     int a;
//     int b;

//     thissss() {
//         this(0, 0); 
//     }

//     thissss(int a, int b) {
//         this.a = a;
//         this.b = b;
//     }

//     void display() {
//         System.out.println("a = " + a + " b = " + b);
//     }

//     void invokeDisplay() {
//         this.display();
//     }

//     public static void main(String[] args) {
//         thissss obj1 = new thissss(10, 20);
//         obj1.invokeDisplay();

//         thissss obj2 = new thissss(); 
//         obj2.invokeDisplay();
//     }
// }\




public class thissss {
    int a;
    int b;
    thissss obj;

    thissss() {
        this(0, 0, null); 
    }

    thissss(int a, int b) {
        this(a, b, null);
    }

    thissss(int a, int b, thissss obj) {
        this.a = a;
        this.b = b;
        this.obj = obj;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
        if (obj != null) {
            System.out.println("Inner object: a = " + obj.a + " b = " + obj.b);
        }
    }

    public static void main(String[] args) {
        thissss obj1 = new thissss(10, 20);
        obj1.display();

        thissss obj2 = new thissss(30, 40, obj1); 
        obj2.display();
    }
}