public class thissss {
    int a;
    int b;
    
    thissss(int a, int b){
        this.a = a;
        this.b = b;
    }
    void display(){
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        thissss obj = new thissss(10, 20);
        obj.display();
    }
}
