package HW.Practice;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
/*
Користувач вводить з клавіатури три числа.
Залежно від вибору користувача, програма виводить на екран суму трьох чисел або добуток трьох чисел.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int num1 = scan.nextInt();

        System.out.println("Введіть друге число");
        int num2 = scan.nextInt();

        System.out.println("Введіть третє число");
        int num3 = scan.nextInt();

        System.out.println("Виберіть опцію");
        System.out.println("1. Сума");
        System.out.println("2. Добуток");

        int userChoice = scan.nextInt();

        switch (userChoice) {
            case 1:
                double sum = num1 + num2 + num3;
            {
                System.out.println("Сума трьох чисел: " + sum);
            }
            break;
            case 2:
                double multiple = num1 * num2 * num3;
            {
                System.out.println("Добуток трьох чисел: " + multiple);
            }
        }
    }
}
