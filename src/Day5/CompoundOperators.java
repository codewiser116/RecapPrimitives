package Day5;

public class CompoundOperators {
    public static void main(String[] args) {
        int number = 10;
        number += 1; // 11number-=5; // 6
        number /= 2; // 3
        number *= 34; // 102
        number %= 3; // 0
        System.out.println(number);

        int number1 = 2345;
        number1 += 8;
        number1 /= 3;
        number1 %= 5;
        number1 *= 5;
        System.out.println("(2345 + 8) / 3 % 5 * 5 = " + number1);

    }
}
