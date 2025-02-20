public class practice {
    private int value;

    public practice() {
        this.value = 0;
    }

    public practice(int value) {
        this.value = value;
    }

    public practice(String value) {
        this.value = Integer.parseInt(value);
    }

    public void display() {
        System.out.println("Value: " + this.value);
    }

    public void display(String message) {
        System.out.println(message + ": " + this.value);
    }

    public void display(int increment) {
        System.out.println("Value after increment: " + (this.value + increment));
    }

    public static void main(String[] args) {
        practice obj1 = new practice();
        practice obj2 = new practice(10);
        practice obj3 = new practice("20");

        obj1.display();
        obj2.display("Current value");
        obj3.display(5);
    }
}
