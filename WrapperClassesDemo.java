public class WrapperClassesDemo {
    public static void main(String[] args) {
        int number = 100;
        double price = 99.99;
        char grade = 'A';
        boolean status = true;

        Integer numberObj = Integer.valueOf(number);
        Double priceObj = Double.valueOf(price);
        Character gradeObj = Character.valueOf(grade);
        Boolean statusObj = Boolean.valueOf(status);

        System.out.println("Primitive int: " + number);
        System.out.println("Wrapper Integer: " + numberObj);
        System.out.println("Primitive double: " + price);
        System.out.println("Wrapper Double: " + priceObj);
        System.out.println("Primitive char: " + grade);
        System.out.println("Wrapper Character: " + gradeObj);
        System.out.println("Primitive boolean: " + status);
        System.out.println("Wrapper Boolean: " + statusObj);
    }
}