package Day5;

public class DataTypes {

    public static void main(String[] args) {
        // Primitive data types
        // byte, short, int, long, float, double, boolean char
        // float vs double -> decimal numbers
        // Declaring float we must put in the end F or f
        // Declaring double we can go as it is
        // float - 6-7 digits after the point
        // double - 15 digits after the point
//        float floatNumber = 5.4543534543F;
//        double doubleNumber = 5.45435345431234567367671;
//        System.out.println(floatNumber);
//        System.out.println(doubleNumber);
//        long longNumber = 2147483648L;
//        byte byteNumber = 127;
        double doubleNumber2 = 12.6;
        long longNumber = (long) doubleNumber2;
        float floatNumber = (float) doubleNumber2;
        System.out.println(longNumber);
        System.out.println(floatNumber);
        // when you cast from decimal to int
        // it doesn't round it, IT takes only whole part

        boolean myBoolean; // we declare and initialize;
        myBoolean = false; // reassign
        boolean myBoolean2; // we can declare without value
        myBoolean2 = true; // initialize




    }
}
