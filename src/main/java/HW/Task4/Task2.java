package HW.Task4;

import java.util.Scanner;

public class Task2 {
    /*2. Напишіть програму, яка перевірятиме, чи є введене число з клавіатури, паліндромом
    (яке можна однаково прочитати в обох напрямках). Наприклад, 123454321 або 221122 — паліндром. Програма має вивести YES,
     якщо число є паліндромом, і NO якщо число не паліндром.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number = number / 10;
        }

        return originalNumber == reversedNumber;

    }
}
