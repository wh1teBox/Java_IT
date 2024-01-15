package HW.Practice;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
/*Користувач вводить із клавіатури номер місяця (від 1 до 12).
Залежно від отриманого номера місяця програма виводить на екран напис: "Winter" (якщо введено значення 1, 2 або 12),
"Spring" (якщо введено значення від 3 до 5), "Summer" (якщо введено значення від 6 до 8), "Autumn"
(якщо введено значення від 9 до 11).
Якщо користувач ввів значення не в діапазоні від 1 до 12, виведіть повідомлення про помилку.
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер місяця (від 1 до 12):");
        int month = scanner.nextInt();

        if (month >= 1 && month <= 12) {
            if (month == 1 || month == 2 || month == 12) {
                System.out.println("Winter");
            } else if (month >= 3 && month <= 5) {
                System.out.println("Spring");
            } else if (month >= 6 && month <= 8) {
                System.out.println("Summer");
            } else if (month >= 9 && month <= 11) {
                System.out.println("Autumn");
            }
        } else {
            System.out.println("Помилка: введено некоректний номер місяця.");
        }

        scanner.close();
    }
        }


