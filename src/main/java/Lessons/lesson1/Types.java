package Lessons.lesson1;

public class Types {
    public static void main(String[] s) {
        //=== примітивні типм даних ===
        // numbers
        // цілі числа
        byte b = 10; //-128 to 127; 2^8 -2^7 to 2^7 -1
        short sh = 20; // 2^16 діапазон: -2^15 to 2^15 -1
        int in = 999999999; // 2^32 -2^31 to 2^31 -1
        long l = 999999999999L; // 2^64

        // дробові числа
        float fl = 15.5F; //(4 byte)
        double d = 15.5; //(8 byte = long)

        //symbols
        char ch = 'A';//(2 byte)

        //logic
        boolean bool = true; //(1 byte)

        // особливості типів double(float)
        System.out.println(d/0);// Infinity
        System.out.println(-d/0); //-Infinity
        System.out.println(0.0/0.0);// Not a number (NaN)

        //**Силочні типи даних**
        String name = "Jack";

        //класи обгортки для примітивів
        Byte.parseByte("15");
        Short.valueOf("22");
        Integer.valueOf(15);
        Double.hashCode(15.0);

        Character.isDigit('9');
        Boolean.getBoolean("Hello");





    }

}
