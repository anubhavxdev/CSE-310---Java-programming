class Bicycle {
    private int gear;
    private int speed;
    public Bicycle() {
        gear = 1;
        speed = 0;
    }
    public void speedUp(int increment) {
        speed += increment;
    }
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
    public void displayStatus() {
        System.out.println("Gear: " + gear + " Speed: " + speed);
    }   
}
public class nonparamconst {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.speedUp(5);
        bike.displayStatus();
        bike.applyBrake(2);
        bike.displayStatus();
    }
}
