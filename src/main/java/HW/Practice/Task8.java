package HW.Practice;

import java.util.Scanner;

public class Task8 {
    /*Користувач вводить з клавіатури кількість годин. Якщо отримане значення знаходиться в діапазоні від 0 до 6,
    виведіть напис «Good Night», якщо в діапазоні від 6 до 13 — «Good Morning»,
    якщо в діапазоні від 13 до 17 — «Good Day», якщо від 17 до 0 — «Good Evening».
    Верхня межа діапазону не береться до уваги. Наприклад, число 6 відноситься до діапазону від 6 до 13.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість годин:");
        int hours = scanner.nextInt();

        if (hours >= 0 && hours < 6) {
            System.out.println("Good Night");
        } else if (hours >= 6 && hours < 13) {
            System.out.println("Good Morning");
        } else if (hours >= 13 && hours < 17) {
            System.out.println("Good Day");
        } else if (hours >= 17 && hours < 24) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Некоректне значення годин");
        }
        scanner.close();
    }
}
