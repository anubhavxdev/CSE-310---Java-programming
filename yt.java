import java.util.Scanner;

public class yt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        
        String lowerCaseString = input.toLowerCase();
        System.out.println(lowerCaseString);
    }
}