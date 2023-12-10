package Lessons.lesson1;

public class Types {
    public static void main(String[] s) {
        //=== примітивні типи даних ===
        //==числові типи==

        // цілі числа
        byte b = 10; // діапазон –128 до 127, 8 біт -> 1 байт
        short sh = 20; // діапазон: –2^16 -> 2^15; 16 біта -> 2 байта
        int in = 999999999; // діапазон:-2^31 -> 2^31; 32 біта -> 4 байт
        long l = 999999999999L; //діапазон: –2^63 -> 2^63; 64 біта -> 8 байта

        // дробові числа
        float fl = 15.5F; // 32 біта -> 4 байта(int)
        double d = 15.5; // 64 біта -> 8 байта (long)

        //symbols
        char ch = 'A';//(2 byte)

        //logic
        boolean bool = true; //(1 byte)

        // особливості типів double/float
        System.out.println(d/0);// Infinity
        System.out.println(-d/0); //-Infinity
        System.out.println(0.0/0.0);// Not a number (NaN)
        System.out.println(1.0 / 0.0); // // Not a number (NaN)
        // NaN==NaN -> false
        // Infinity==Infinity -> false

        //=== Силочні типи даних ===

        String name = "Jack";

        //класи обгортки для примітивів
        Byte.parseByte("15");
        Short.valueOf("22");
        Integer.toString(15);
        Double.hashCode(15.0);

        Character.isDigit('9');
        Boolean.getBoolean("Hello");
    }

}
