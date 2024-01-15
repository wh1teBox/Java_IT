package HW.Lesson3;

import java.util.Scanner;
public class Task12{

    /*Завдання 12
Програма запитує шестизначне число. Після введення програма
визначає, чи буде квиток з таким номером «щасливим» (сума
перших трьох цифр збігається із сумою трьох останніх цифр).
Приклад введених даних:
423027
954832
Вивід:
Так
Ні*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть шестизначний номер квитка: ");
        int ticketNumber = scanner.nextInt();

        if (ticketNumber < 100000 || ticketNumber > 999999) {
            System.out.println("Введіть шестизначне число.");
        } else {
            int firstHalf = ticketNumber / 1000;
            int secondHalf = ticketNumber % 1000;

            int sumFirstHalf = 0;
            int sumSecondHalf = 0;

            while (firstHalf > 0) {
                sumFirstHalf += firstHalf % 10;
                firstHalf /= 10;
            }

            while (secondHalf > 0) {
                sumSecondHalf += secondHalf % 10;
                secondHalf /= 10;
            }

            if (sumFirstHalf == sumSecondHalf) {
                System.out.println("Так, це щасливий квиток.");
            } else {
                System.out.println("Ні, це не щасливий квиток.");
            }
        }
        scanner.close();
    }
}
