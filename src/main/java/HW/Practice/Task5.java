package HW.Practice;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        /*Користувач вводить з клавіатури число. Перевірте його на парність і непарність.
        Якщо число парне, виведіть на екран число з написом «Even number».
        Якщо число непарне, виведіть на екран число з написом «Odd number».*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Put a number");

        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even numbe");
        } else {
            System.out.println("Odd number");
        }
    }
}
