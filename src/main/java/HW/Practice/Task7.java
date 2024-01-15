package HW.Practice;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*Користувач вводить з клавіатури три числа.
         Залежно від вибору користувача, програма виводить на екран максимум із трьох,
          мінімум із трьох або середнє арифметичне трьох чисел.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("put first number");
        int num1 = scan.nextInt();

        System.out.println("put second number");
        int num2 = scan.nextInt();

        System.out.println("put third number");
        int num3 = scan.nextInt();

        System.out.println("Make your choice: 1, 2 or 3");
        int userChoice = scan.nextInt();

        switch(userChoice) {
            case 1 -> {
                int maxValue = Math.max(Math.max(num1, num2), num3);
                System.out.println("This is max value: " + maxValue);
            }
            case 2 -> {
                int minValue = Math.min(Math.min(num1, num2), num3);
                System.out.println("This is min value: " + minValue);
            }
            case 3 -> {
                int midValue = (num1 + num2 + num3) / 3;
                System.out.println("This is avarage value: " + midValue);
            }
        }
    }
}
