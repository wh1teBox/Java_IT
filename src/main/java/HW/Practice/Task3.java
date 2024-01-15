package HW.Practice;

import java.util.Scanner;

public class Task3 {
    /*Користувач вводить з клавіатури три цифри.
     Створіть число, яке містить ці цифри.
     Наприклад, якщо з клавіатури введено 7, 3, 8, тоді потрібно сформувати число 738.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("number1");
        String  num1 = scan.nextLine();

        System.out.println("number1");
        String  num2 = scan.nextLine();

        System.out.println("number1");
        String  num3 = scan.nextLine();

        System.out.println(num1 + num2 + num3);

/*Завдання 2:
Користувач вводить з клавіатури число, що складається з чотирьох цифр.
Потрібно знайти добуток цифр. Наприклад, якщо з клавіатури введено 1324, тоді результат добутку 1*3*2*4 = 24.*/

        System.out.println("number1");
        int number1 = scan.nextInt();

        System.out.println("number2");
        int number2 = scan.nextInt();

        System.out.println("number3");
        int number3 = scan.nextInt();

        System.out.println("number4");
        int number4 = scan.nextInt();

        int result = number1 * number2 * number3 * number4;
        System.out.println(result);







    }
}
