package HW.Practice;

import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
/*Користувач вводить з клавіатури число в діапазоні від 1 до 100.
Якщо число кратне 3 (ділиться на 3 без остачі), виведіть слово "Fizz".
Якщо число кратне 5, виведіть слово "Buzz". Якщо число кратне 3 та 5, виведіть "Fizz Buzz".
Якщо число не кратне ні 3 і не 5, виведіть тільки число.
Якщо користувач ввів значення не в діапазоні від 1 до 100, виведіть повідомлення про помилку.*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a number between 1 and 100:");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 100) {
            // Generate a random number between 1 and 100
            int randomValue = random.nextInt(100) + 1;

            if (randomValue % 3 == 0 && randomValue % 5 == 0) {
                System.out.println("Fizz Buzz");
            } else if (randomValue % 3 == 0) {
                System.out.println("Fizz");
            } else if (randomValue % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(randomValue);
            }
        } else {
            System.out.println("Error: The entered number is out of range.");
        }

        scanner.close();
    }
}

