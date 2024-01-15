package HW.Lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* 1) Користувач вводить з клавіатури деякі числа (a, b, c),
        вивести на екран всі числа які є одночасно кратними числам (a, b, c) з діапазону від 0 до 100000*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();

        if (a == 0 || b == 0 || c == 0) {
            System.out.println("a, b, and c must be non-zero values.");
        } else {
            for (int number = 0; number <= 100000; number++) {
                if (number % a == 0 && number % b == 0 && number % c == 0) {
                    System.out.println(number);
                }
            }
        }
    }
}
