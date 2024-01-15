package HW.Lesson7;

import java.util.Random;

public class Task5 {
    /*Заповніть масив з 10 елементів випадковими числами від -10 до
+10. Підрахуйте кількість повторюваних значень. Виведіть в
консоль тільки повторювані елементи і кількість повторень.
Приклад:
0 – 5 разів
2 – 3 рази
7 – 1 разів*/
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        int[] counts = new int[21];

        for (int num : array) {
            counts[num + 10]++;
        }

        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            if (count > 1) {
                System.out.println((i - 10) + " - " + count + " разів");
            }
        }
    }
}
