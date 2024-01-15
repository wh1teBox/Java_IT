package HW.Lesson3;

import java.util.Scanner;

public class Task2 {
    /*Завдання 2
     З клавіатури вводиться час (кількість годин від 0 до 24) — програма виводить привітання, відповідне до введеного часу
    (наприклад, ввели 15 годин — виводитьсяпривітання: «Доброго дня»).
      */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточний час (години від 0 до 24): ");

        int time  = scanner.nextInt();

        if (time >= 0 && time < 24) {
            if (time >= 6 && time < 12) {
                System.out.println("Доброго ранку!");
            } else if (time >= 12 && time < 18) {
                System.out.println("Доброго дня!");
            } else {
                System.out.println("Доброго вечора!");
            }
        } else {
            System.out.println("Ви ввели некоректний час.");
        }

        scanner.close();


    }

}
