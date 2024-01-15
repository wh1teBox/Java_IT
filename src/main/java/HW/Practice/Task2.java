package HW.Practice;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
/*Завдання 4:
Користувач вводить з клавіатури два числа. Перше число — це значення, друге число — відсоток, який необхідно обчислити.
Наприклад, ми ввели з клавіатури 50 та 10. Потрібно вивести на екран 10% від 50. Результат: 5*/

        Scanner scan = new Scanner(System.in);
        System.out.println("number1");
        double number = scan.nextInt();

        System.out.println("number2");
        double percentage = scan.nextInt();

        double result = (percentage / 100) / number;

        System.out.println(result);


    }
}
