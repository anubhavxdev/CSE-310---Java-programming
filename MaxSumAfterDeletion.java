import java.util.*;

public class MaxSumAfterDeletion {

    // Method to encode a list of messages into a single string
    public static String encode(List<String> messages) {
        StringBuilder encoded = new StringBuilder();
        for (String message : messages) {
            if (encoded.length() > 0) {
                encoded.append("#");
            }
            encoded.append(message);
        }
        return encoded.toString();
    }

    // Method to decode a single string into a list of messages
    public static List<String> decode(String encoded) {
        return Arrays.asList(encoded.split("#"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input messages
        System.out.println("Enter messages separated by space:");
        String input = scanner.nextLine();
        List<String> messages = Arrays.asList(input.split(" "));
        
        // Encode the messages
        String encoded = encode(messages);
        System.out.println("Encoded: " + encoded);
        
        // Decode the encoded string
        List<String> decodedMessages = decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decodedMessages) {
            System.out.println(message);
        }
        
        scanner.close();
    }
}

