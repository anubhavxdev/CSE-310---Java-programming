public class wrapper {
    public static void main(String[] args) {
        Character ch = 'A';
        Integer num = 65;
        Byte b = 65;
        Short s = 65;
        Double d = 65.0;
        Float f = 65.0f;
        Long l = 65554L;

        System.err.println("Character: " + ch);
        System.err.println("Integer: " + num);
        System.err.println("Byte: " + b);
        System.err.println("Short: " + s);
        System.err.println("Double: " + d);
        System.err.println("Float: " + f);
        System.err.println("Long: " + l);

        int intFromChar = ch;
        int intFromByte = b;
        int intFromShort = s;
        double doubleFromFloat = f;
        long longFromInt = num;

        System.err.println("int from Character: " + intFromChar);
        System.err.println("int from Byte: " + intFromByte);
        System.err.println("int from Short: " + intFromShort);
        System.err.println("double from Float: " + doubleFromFloat);
        System.err.println("long from Integer: " + longFromInt);
    }
}
