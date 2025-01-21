class A{
    public void display(){
        System.out.println("Private method of class A");
    }
}
class Main{
    public static void main(String args[]) {
        A obj = new A();
        obj.display();
    }
}
