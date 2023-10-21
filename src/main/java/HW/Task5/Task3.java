package HW.Task5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

/*       -заповнений трикутник
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть висоту рівнобедреного трикутника: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= 2 * height - 1; j++) {

                if (j >= height - i + 1 && j <= height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
      }
    }
            System.out.println();*/

        /*пустий трикутник*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть висоту рівнобедреного порожнього трикутника: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= 2 * height - 1; j++) {
                if (i == height || j == height - i + 1 || j == height + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

