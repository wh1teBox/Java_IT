package HW.Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
/*Завдання 3:
Користувач вводить з клавіатури довжину та ширину прямокутника.
Виведіть на екран незаповнений прямокутник (відображаються лише межі прямокутника).
Розмір довжини та ширини дорівнює введеним даним.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Довжина прямокутника");
        int length = scan.nextInt();

        System.out.println("Ширина прямокутника");
        int width = scan.nextInt();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                    System.out.print("# "); // символ межі прямокутника
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            }
        }