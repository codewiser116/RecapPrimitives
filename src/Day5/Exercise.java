package Day5;

public class Exercise {
    public static void main(String[] args) {
// Delcare compound operators and Modulus
// 1
//        double number = 5.43;
//        number+=5; // 10.43
//        number-=3.23; // 7.20
//        number*=9; // ..
//        number/=2;
//        number%=3;
//        System.out.println(number);
        // 2
//        int myInt1 = 5, myInt2 = 61, myInt3 = 92;
//        System.out.println((myInt1 % 2) == 0);
//        System.out.println((myInt2 % 2) == 0);
//        System.out.println((myInt3 % 2) == 0);

//        String name = "Maksat";
//        int age = 12;
//        System.out.println(name + " "+ (age >= 28));
        // 3

        int number = 79463;
        System.out.println(number);
        System.out.println(number % 2 == 0);
        System.out.println(number % 12 == 0);

        // 89463 % 10 = 3
        int fifthDigit = number % 10;
        int fourthDigit = number % 100 / 10;
        int thirdDigit = number % 1000 / 100;
        int secondDigit = number % 10000 / 1000;
        int firstDigit = number / 10000;
        System.out.println(firstDigit + ", " + secondDigit + ", " +
                thirdDigit + ", " + fourthDigit + ", " + fifthDigit);
    }
}
