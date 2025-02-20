public class stringinjava {
    public static void main(String[] args) {
        // String strliteral = "Hello, World!";
        // String strnew = new String("Hello, World!");
        // String strnew1 = new String("Hello, World!");

        // System.out.println("String created using string literal: " + strliteral);
        // System.out.println("String created using new keyword: " + strnew);

        // System.out.println("comparsion of strliteral and strnew: " + strliteral.equals(strnew));
        // System.out.println("comparsion of strliteral and strnew: " + strliteral.equals(strnew1));
        // System.out.println("comparsion of strliteral and strnew: " + strliteral.equals(strnew));
        // System.out.println("comparsion of strliteral and strnew: " + strliteral.equals(strnew));ri


        String emptystring = new String();
        System.out.println("Empty string: " + emptystring);

        String originalstring = "Hello, World!";
        String copiedstring = new String(originalstring);
        System.out.println("Copied string: " + copiedstring);

        byte[] bytes = { 72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33 };
        String byteString = new String(bytes);
        System.out.println("String from bytes: " + byteString);

        char[] chars = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        String charString = new String(chars);
        System.out.println("String from chars: " + charString);




        StringBuilder sb1 = new StringBuilder("Hello, World!");
        sb1.append(" Welcome to Java!");
        sb1.append(123);
        System.out.println("String Builder: " + sb1.toString());

        StringBuilder sb2 = new StringBuilder("Hello,");
        sb2.insert(5, " World!");
        System.out.println("String Builder: " + sb2.toString());
        StringBuilder sb3 = new StringBuilder("Hello, World!");
        sb3.replace(7, 12, "Java");
        System.out.println("String Builder: " + sb3.toString());


        StringBuilder sb4 = new StringBuilder("Hello, World!");
        sb4.delete(7, 12);
        System.out.println("String Builder: " + sb4.toString());

        StringBuilder sb5 = new StringBuilder("Hello, World!");
        sb5.reverse();
        System.out.println("String Builder: " + sb5.toString());

        StringBuilder sb6 = new StringBuilder("Hello, World!");
        sb6.deleteCharAt(7);
        System.out.println("String Builder: " + sb6.toString());

        StringBuilder sb7 = new StringBuilder("Hello, World!");
        sb7.setCharAt(7, 'J');
        System.out.println("String Builder: " + sb7.toString());
        
        StringBuilder sb8 = new StringBuilder("Hello, World!");
        sb8.insert(7, "Java, ");
        System.out.println("String Builder: " + sb8.toString());

        }
    }
