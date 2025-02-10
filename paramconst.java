class car {
    String brand;
    int year;

    public car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + " Year: " + year);
    }
}



public class paramconst {
    public static void main(String[] args) {
        car myCar = new car("BMW", 2020);
        myCar.displayInfo();
    }
}
