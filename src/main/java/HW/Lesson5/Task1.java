package HW.Lesson5;

import java.util.Scanner;

public class Task1 {
    /*
     Завдання 1
    Прямокутний трикутник: прямий кут внизу справа, заповнений і порожній.*/
    public static void main(String[] args) {

        // Створення об'єкту Scanner для зчитування введення користувача
        Scanner scanner = new Scanner(System.in);

        // Запит користувача на введення висоти прямокутного трикутника
        System.out.print("Введіть висоту прямокутного трикутника: ");
        int height = scanner.nextInt();

        // Вивід прямокутного трикутника
        printRightAngleTriangle(height);

        // Закриття об'єкту Scanner
        scanner.close();
    }

    // Метод для виводу прямокутного трикутника з прямим кутом внизу справа (лише межі)
    private static void printRightAngleTriangle(int height) {
        for (int i = 0; i < height; i++) {
            // Вивід пробілів перед заповненим частиню трикутника
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            // Вивід символів межі трикутника (заповнений частиною)
            for (int k = i; k < height; k++) {
                // Визначення, чи потрібно вивести символ межі трикутника чи пробіл
                if (k == i || k == height - 1 || i == height - 1) {
                    System.out.print("# "); // символ межі трикутника (заповнений частиною)
                } else {
                    System.out.print("  "); // пробіл
                }
            }

            System.out.println(); // перехід на новий рядок після завершення рядка трикутника
        }
            }
        }


