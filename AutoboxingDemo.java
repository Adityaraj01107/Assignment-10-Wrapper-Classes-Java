public class AutoboxingDemo {
    public static void main(String[] args) {
        int number = 100;
        double value = 25.50;
        char letter = 'A';
        boolean flag = true;

        Integer intObj = number;
        Double doubleObj = value;
        Character charObj = letter;
        Boolean boolObj = flag;

        System.out.println("Autoboxing int -> Integer: " + intObj);
        System.out.println("Autoboxing double -> Double: " + doubleObj);
        System.out.println("Autoboxing char -> Character: " + charObj);
        System.out.println("Autoboxing boolean -> Boolean: " + boolObj);
    }
}