package HW.Lesson5;

import java.util.Scanner;

public class Task2 {
/*Завдання 2:
Користувач вводить з клавіатури розмір сторони квадрата.
Виведіть на екран незаповнений квадрат (відображаються лише межі квадрата). Розмір сторони дорівнює введеному розміру.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір сторони квадрата: ");
        int size = scanner.nextInt();

        // Вивід незаповненого квадрата
        printSquare(size);

        scanner.close();
    }

    private static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Визначення, чи потрібно вивести символ межі квадрата чи пробіл
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("# "); // символ межі квадрата
                } else {
                    System.out.print("  "); // пробіл
                }
            }
            System.out.println(); // перехід на новий рядок після завершення рядка квадрата
        }
    }
}
