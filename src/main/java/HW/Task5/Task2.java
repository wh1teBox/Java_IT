package HW.Task5;

import java.util.Scanner;

public class Task2 {
    /*Прямокутний трикутник: прямий кут зверху справа, заповнений і порожній.*/
    public static void main(String[] args) {

//        заповнений трикутник

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введіть висоту трикутника: ");
//        int height = scanner.nextInt();
//
//        for (int i = 1; i <= height; i++) {
//
//            for (int j = 1; j <= height; j++) {
//
//                if (j <= height - i) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//
//            System.out.println();
//        }

//      порожній трикутник
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть висоту трикутника: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {

            for (int j = 1; j <= height; j++) {

                if (j == height || i == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
