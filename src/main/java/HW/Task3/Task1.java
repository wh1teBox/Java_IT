package HW.Task3;

import java.util.Scanner;

public class Task1 {
    /*Завдання 1:
        Напишіть програму, яка пропонує користувачу ввести з
        клавіатури номер дня тижня, і у відповідь показує назву цього
        дня (наприклад, 6 — субота). Розв'яжіть завдання з
        використанням switch.*/
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the day number (1-7): ");

                int dayNumber = scanner.nextInt();

                switch (dayNumber) {
                    case 1:
                        System.out.println("1 - Monday");
                        break;
                    case 2:
                        System.out.println("2 - Tuesday");
                        break;
                    case 3:
                        System.out.println("3 - Wednesday");
                        break;
                    case 4:
                        System.out.println("4 - Thursday");
                        break;
                    case 5:
                        System.out.println("5 - Friday");
                        break;
                    case 6:
                        System.out.println("6 - Saturday");
                        break;
                    case 7:
                        System.out.println("7 - Sunday");
                        break;
                    default:
                        System.out.println("Invalid day number. Please enter a number between 1 and 7.");
                }

                scanner.close();
            }
        }