package Lessons.Lesson2;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("write your name ");
        String name = scanner.nextLine();
        System.out.println("Name " + name);

        System.out.println("Write some number = ");
        int num;
        num = scanner.nextInt();
        System.out.println("num = " + num);

        System.out.println("Write some fractional number = ");
        double num2 = scanner.nextDouble();
        System.out.println("double = " + num2);

        System.out.println("Write some words using spase = ");
        String str = scanner.next();
        System.out.println("str = " + str);
        System.out.println(scanner.next());

        scanner.close();
    }
}
