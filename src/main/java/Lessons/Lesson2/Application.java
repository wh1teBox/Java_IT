package Lessons.Lesson2;

public class Application {
    public static void main(String[] args) {
        //byte -> long -> неявне перетворення
        byte b = 12;
        long l = b;

        //int -> short -> явне перетворення
        int i = 50000000;
        short sh = (short)i;

        // втрата даних
        int i1 = 129;
        byte b1 = (byte) i1;
        System.out.println("b1 = " + b1);// || ------ 0 +++++++ || -3 ---- 0 ++++++

        // константа

        final int num = 15;
        // num = 22;
    }
}
