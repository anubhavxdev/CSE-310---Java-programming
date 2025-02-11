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



public class thissss {
    int a;
    int b;

    thissss() {
        this(0, 0); 
    }

    thissss(int a, int b) {
        this.a = a;
        this.b = b;
    }

    thissss getInstance() {
        return this;
    }

    void display() {
        System.out.println("a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        thissss obj1 = new thissss(10, 20);
        obj1.display();

        thissss obj2 = new thissss(); 
        obj2.display();

        thissss obj3 = obj1.getInstance();
        obj3.display();
    }
}