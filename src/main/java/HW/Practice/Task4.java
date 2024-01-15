package HW.Practice;

import java.util.Scanner;

public class Task4 {
    /*Користувач вводить з клавіатури чотиризначне число.
    Вам необхідно перевернути число і відобразити результат. Наприклад, якщо введено 4512, результат 2154.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть чотиризначне число");

        int number = scan.nextInt();

        int result = reverseNumber(number);
        System.out.println(result);
    }

    private static int reverseNumber(int number) {
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;

            reverseNumber = reverseNumber * 10 + digit;

            number /= 10;
        }
        return reverseNumber;
    }
}
