package Lessons.lesson7;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask10 {
    public static void main(String[] args) {


        //Завдання 10:
        //Є одновимірний масив, заповнений випадковими числами.

        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10, 100);
            // System.out.print(arr[i] + " ");
        }

        //Використовуючи дані цього масиву:
        // Створіть одновимірний масив, що містить лише парні числа
        //з першого масиву.
        int oddCount = 0;
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddCount++;
            }
            if (arr[i] % 2 != 0) {
                evenCount++;
            }
        }

        int addCountPlus = 0;
        int evenCountPlus = 0;
        int[] oddArr = new int[oddCount]; // 11 25 30 54 69 78 45 13
        int[] evenArr = new int[evenCount];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                oddArr[addCountPlus] = arr[i];
                addCountPlus++;
            }
            if (arr[i] % 2 != 0) {
                evenArr[evenCountPlus] = arr[i];
                evenCountPlus++;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(oddArr));
        System.out.println(Arrays.toString(evenArr));


        // Створіть одновимірний масив, що містить лише непарні
        //числа з першого масиву.


        // Створіть одновимірний масив, що містить лише від'ємні
        //числа з першого масиву.
        // Створіть одновимірний масив, що містить лише додатні
        //числа з першого масиву.

    }
}

