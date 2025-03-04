interface A {
    void msg();
}

interface B {
    void msg();
}

class C implements A, B {
    public void msg() { // Must override msg() to resolve ambiguity
        System.out.println("Hello from C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.msg();
    }
}
