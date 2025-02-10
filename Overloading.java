class CalculateSquare {
   
    public void square() {
        System.out.println("No parameter method called.");
    }

    public int square(int number) {
        int square = number * number;
        System.out.println("Method with int argument called: " + square);
        return square;
    }

    public float square(float number) {
        float square = number * number;
        System.out.println("Method with float argument called: " + square);
        return square;
    }


    public float multiply(float number1, float number2) {
        float product = number1 * number2;
        System.out.println("Method with two float arguments called (Multiplication): " + product);
        return product;
    }
}

public class Overloading {
    public static void main(String[] args) {
        CalculateSquare obj = new CalculateSquare();
        
        obj.square(); 
        obj.square(5);
        obj.square(3.5f); 
        obj.multiply(2.5f, 4.0f); 
    }
}
