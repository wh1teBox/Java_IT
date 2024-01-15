package HW.Practice;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
/*Користувач вводить з клавіатури два числа (початок і кінець діапазону). Проаналізуйте усі числа у цьому діапазоні.
Виведення на екран має відбуватися за правилами, наведеними нижче.
Якщо число кратне 3 (ділиться на 3 без остачі), виведіть слово "Fizz". Якщо число кратне 5, виведіть слово "Buzz".
Якщо число кратне 3 і 5, виведіть "Fizz Buzz". Якщо число не кратне ні 3 і не 5, виведіть тільки число.*/
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть початок діапазону:");
            int start = scanner.nextInt();

            System.out.println("Введіть кінець діапазону:");
            int end = scanner.nextInt();

            if (start <= end) {
                for (int number = start; number <= end; number++) {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.println("Fizz Buzz");
                    } else if (number % 3 == 0) {
                        System.out.println("Fizz");
                    } else if (number % 5 == 0) {
                        System.out.println("Buzz");
                    } else {
                        System.out.println(number);
                    }
                }
            } else {
                System.out.println("Помилка: Початок діапазону повинен бути менше або рівний кінцю діапазону.");
            }
            scanner.close();
        }
    }

