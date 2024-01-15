package HW.Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    /*Реалізуйте серію з n ігор "Камінь, ножиці, папір" з комп'ютером.
     В результаті виведіть статистику: скільки ігор виграв користувач, скільки разів кожного виду ходів було вибрано.
     Доповніть гру аналізом комп'ютера ваших ходів і вибір найбільш підходящого проти вас ходу.*/

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int userWins = 0;
            int computerWins = 0;
            int ties = 0;
            int[] userChoices = new int[3];

            String[] choices = {"Камінь", "Ножиці", "Папір"};

            System.out.println("Ласкаво просимо до гри 'Камінь, ножиці, папір'!");

            while (true) {
                System.out.print("Виберіть свій хід (0 - Камінь, 1 - Ножиці, 2 - Папір, -1 - Закінчити гру): ");
                int userChoice = scanner.nextInt();

                if (userChoice == -1) {
                    break;
                }

                if (userChoice < 0 || userChoice > 2) {
                    System.out.println("Некоректний вибір. Будь ласка, виберіть ще раз.");
                    continue;
                }

                int computerChoice = random.nextInt(3);

                System.out.println("Ваш хід: " + choices[userChoice]);
                System.out.println("Хід комп'ютера: " + choices[computerChoice]);

                if (userChoice == computerChoice) {
                    System.out.println("Нічия!");
                    ties++;
                } else if ((userChoice == 0 && computerChoice == 1) ||
                        (userChoice == 1 && computerChoice == 2) ||
                        (userChoice == 2 && computerChoice == 0)) {
                    System.out.println("Ви виграли!");
                    userWins++;
                } else {
                    System.out.println("Комп'ютер виграв!");
                    computerWins++;
                }

                userChoices[userChoice]++;
            }

            System.out.println("Статистика:");
            System.out.println("Кількість перемог гравця: " + userWins);
            System.out.println("Кількість перемог комп'ютера: " + computerWins);
            System.out.println("Кількість нічий: " + ties);

            int mostFrequentUserChoice = 0;
            for (int i = 1; i < 3; i++) {
                if (userChoices[i] > userChoices[mostFrequentUserChoice]) {
                    mostFrequentUserChoice = i;
                }
            }
            System.out.println("Найбільш часто вибраний хід вами: " + choices[mostFrequentUserChoice]);
        }
    }

