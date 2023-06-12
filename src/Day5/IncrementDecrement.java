package Day5;

public class IncrementDecrement {
    public static void main(String[] args) {
        // PostDecrement PreDecrement
        // PostIncrement PreIncrement
        int number = 10;
        System.out.println(--number);
        System.out.println(number--);
        System.out.println(number);
        System.out.println(++number);
        System.out.println(number++);
        System.out.println(number);
        int number2 = ++number;
        System.out.println(number2);
    }
}
