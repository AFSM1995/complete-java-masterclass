public class Main {

    public static void main(String[] args) {
        // int 32 bit (4 bytes)
        int intValue = 5;
        // float 32 bit (4 bytes)
        float floatValue = (float) 5 / 3;
        // double 64 bit (8 bytes)
        double doubleValue = 5D / 3D;

        System.out.println("intValue = " + intValue);
        System.out.println("floatValue = " + floatValue);
        System.out.println("doubleValue = " + doubleValue);

        // Exercise
        double pounds = 200D;
        double kiloGrams = pounds * 0.45359237D;
        System.out.println(kiloGrams);
    }
}
