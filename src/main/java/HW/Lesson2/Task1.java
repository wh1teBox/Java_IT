package HW.Lesson2;

import java.util.Scanner;

public class Task1 {

    /**
     * Завдання 1:
     * У змінних х та y зберігаються два натуральні числа. Створіть програму, виведену в консоль:
     * результат цілісного ділення x на y;  залишок від ділення x на y;
     * квадратний корінь з x
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();

        int divisionResult = x / y;
        int reminder = x % y;
        double squareRoot = Math.sqrt(x);

        System.out.println("Result of division: " + divisionResult);
        System.out.println("Result of reminder: " + reminder);
        System.out.println("Result of squareRoot"+ squareRoot);






    }
}





