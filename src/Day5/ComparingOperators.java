package Day5;

public class ComparingOperators {
    public static void main(String[] args) {
        boolean myBoolean; // we declare and initialize;
        myBoolean = false; // reassign
        boolean myBoolean2; // we can declare without value
        myBoolean2 = true; // initialize

        int num1 = 11, num2 = 10, num3 = 13, num4 = 22, num5; // declare multiple with comma
//        num1 = 11; num2 = 254; // assign in separate statement
        System.out.println(num1==num2);
        System.out.println(myBoolean == myBoolean2); // false==true we can compare boolean values
        // Comparing operators
        System.out.println("1"+ (num1>num2)); // we have only one chance
        System.out.println("2"+ (num1<num2));
        System.out.println("3"+ (num1>=num2));
        System.out.println("4"+ (num1<=num2));
        System.out.println("5"+ (num1==num2));
        System.out.println("6"+ (num1!=num2));
        System.out.println(num1 + " " + num2);
    }
}
