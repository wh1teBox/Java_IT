package Lessons.Lesson3;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //програма робить скидку для пенсіонерів та школярів

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть ваш вік");
        int age;
        double amount = 1000;

        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
            if (age >= 7 && age <= 90) {
                if (age >= 7 && age <= 18) {
                    amount = amount * 0.6;
                    System.out.println("Price will be: " + amount);
                } else if (age < 90) {
                    amount = amount * 0.75;
                    System.out.println("Price will be: " + amount);
                }
            } else {
                System.out.println("Invalid data");
            }
        }
    }
}
