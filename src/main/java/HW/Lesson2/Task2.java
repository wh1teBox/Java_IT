package HW.Lesson2;

import java.util.Scanner;

public class Task2 {
    /**
     *Завдання 2
     * У змінній n зберігається натуральне (ціле) тризначне число.
     * Створіть програму, яка обчислює і виводить на екран суму цифр числа n.
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Put a three-digit integer");
        int n = scanner.nextInt();

        int sum = (n / 100) + ((n / 10) % 10) + (n % 10);
        System.out.println(sum);

// n // 100) дасть 3 (цифра сотень).
// ((n // 10) % 10) дасть 5 (цифра десятків).
// (n % 10) дасть 6 (цифра одиниць).
    }
}
