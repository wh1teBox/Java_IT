package HW.Lesson6;

import java.util.Random;

public class Task8 {
  /*В одновимірному масиві, заповненому випадковими числами, визначте мінімальний та максимальний елементи, підрахуйте
кількість від'ємних та додатних елементів, підрахуйте кількість нулів. Результати виведіть на екран*/
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];


        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(21) - 10;
        }

        int minElement = array[0];
        int maxElement = array[0];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int element : array) {
            if (element < minElement) {
                minElement = element;
            }
            if (element > maxElement) {
                maxElement = element;
            }
            if (element < 0) {
                negativeCount++;
            } else if (element > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Масив: " + java.util.Arrays.toString(array));
        System.out.println("Мінімальний елемент: " + minElement);
        System.out.println("Максимальний елемент: " + maxElement);
        System.out.println("Кількість додатних елементів: " + positiveCount);
        System.out.println("Кількість від'ємних елементів: " + negativeCount);
        System.out.println("Кількість нулів: " + zeroCount);
    }
}

