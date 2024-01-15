package HW.Lesson2;

import java.util.Scanner;

public class Task7 {
    /**
     * Розробіть програму, яка дозволить обчислити суму вкладу банку
     * через два роки за встановленим річним відсотком, якщо задана
     * початкова величина вкладу.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть початкову суму вкладу: ");
        double initialDeposit = scan.nextDouble();

        System.out.println("Введіть річний відсоток (у відсотках): ");
        double annualInterestRate = scan.nextDouble();

        double monthlyInterestRate = annualInterestRate / 100 / 12;

        double finalDeposit = initialDeposit * Math.pow(1 + monthlyInterestRate, 2 * 12);
        System.out.println("Сума вкладу через два роки: " + finalDeposit);
    }
}

