public class UnboxingDemo {
    public static void main(String[] args) {
        Integer intObj = 100;
        Double doubleObj = 25.50;
        Character charObj = 'A';
        Boolean boolObj = true;

        int number = intObj;
        double value = doubleObj;
        char letter = charObj;
        boolean flag = boolObj;

        System.out.println("Unboxing Integer -> int: " + number);
        System.out.println("Unboxing Double -> double: " + value);
        System.out.println("Unboxing Character -> char: " + letter);
        System.out.println("Unboxing Boolean -> boolean: " + flag);
    }
}