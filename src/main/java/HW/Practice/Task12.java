package HW.Practice;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину лінії:");
        int length = scanner.nextInt();

        if (length > 0) {
            for (int i = 0; i < length; i++) {
                System.out.print("*");
            }
            System.out.println();
        } else {
            System.out.println("Помилка: введено некоректну довжину лінії.");

        }

        scanner.close();
    }
}
