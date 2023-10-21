package HW.Task6;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*Заповніть масив розмірності n випадковими цифрами від 0 до 33. Знайдіть елемент масиву, який ділиться без остачі
    на значення елемента зліва і значення елемента справа. Виведіть в консоль значення початкового масиву.
    Виведіть індекс знайденого елемента. Якщо такий не знайдено, виведіть -1. n — задається з клавіатури.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність масиву n: ");
        int n = scanner.nextInt();
        scanner.close();

        int[] array = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = rand.nextInt(34);
        }

        System.out.print("Початковий масив: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int foundIndex = -1;

        for (int i = 1; i < n - 1; i++) {
            if (array[i] % array[i - 1] == 0 && array[i] % array[i + 1] == 0) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Знайдений елемент з індексом " + foundIndex + " : " + array[foundIndex]);
        } else {
            System.out.println("Такого елемента не знайдено.");
        }
    }
}
