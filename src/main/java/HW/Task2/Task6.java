package HW.Task2;

public class Task6 {
    /**Завдання 6 (рішення 1)
     Є прямокутник, в якого відома ширина w і висота h. Обчисліть і
     виведіть в консоль периметр і площу заданого прямокутника.
     Висота і ширина прямокутника має задаватися константними
     змінними в коді програми.
     */
    public  static int perimeter (int width, int height){
        return (width * 2 + 2 * height);
    }
    public static int square (int width, int height){
        return (width * height);
    }

    public static void main(String[] args) {

        System.out.println(perimeter(9,4));
        System.out.println(square(9,4));


        /**Завдання 6(рішення 2)
         Є прямокутник, в якого відома ширина w і висота h. Обчисліть і
         виведіть в консоль периметр і площу заданого прямокутника.
         Висота і ширина прямокутника має задаватися константними
         змінними в коді програми.
         */

        final int w = 9;
        final int h = 4;

        int Perimeter = (w * 2 + 2 * h);
        int Square = w * h;

        System.out.println("Perimeter: "+ Perimeter );
        System.out.println("Square: " + Square);
    }
}
