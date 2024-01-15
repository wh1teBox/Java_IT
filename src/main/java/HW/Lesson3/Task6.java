package HW.Lesson3;

import java.util.Scanner;

public class Task6 {
    /*
    * Визначіть кількість днів в році, який вводить користувач, і виведіть їх у консоль. У високосному році 366 днів,
    * тоді як у звичайному — 365. Високосний рік — це той, що ділиться націло на 4,
    *  за винятком століть, які не діляться націло на 400.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рік: ");
        int year = scanner.nextInt();

        int daysInYear;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInYear = 366;
            System.out.println("Це високосний рік.");
        } else {
            daysInYear = 365;
            System.out.println("Це не високосний рік.");
        }

        System.out.println("У році " + year + " " + daysInYear + " днів.");
    }
}
