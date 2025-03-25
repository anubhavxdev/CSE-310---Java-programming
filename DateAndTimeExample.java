import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTimeExample {
    public static void main(String[] args) {
      
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

    
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);


        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);



        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);


        LocalDate customDate = LocalDate.of(2023, 12, 25);
        LocalTime customTime = LocalTime.of(10, 30);
        System.out.println("Custom Date: " + customDate);
        System.out.println("Custom Time: " + customTime);
    }
}