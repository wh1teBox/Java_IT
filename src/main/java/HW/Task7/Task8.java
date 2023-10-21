package HW.Task7;

import java.util.Random;
import java.util.Scanner;

public class Task8 {
    /*Завдання 8
Заповніть масив розмірності n випадковими, малими
латинськими літерами. Підрахуйте, скільки разів трапляється
кожна літера. Виведіть літери, які трапляються більше 3 разів. n
— задається з клавіатури.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введіть розмірність масиву n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Розмірність масиву повинна бути більше 0.");
            return;
        }

        char[] lettersArray = new char[n];


        for (int i = 0; i < n; i++) {
            lettersArray[i] = (char) (random.nextInt(26) + 'a');
        }

        int[] letterCounts = new int[26];


        for (char letter : lettersArray) {
            int index = letter - 'a';
            letterCounts[index]++;
        }


        for (int i = 0; i < 26; i++) {
            if (letterCounts[i] > 3) {
                char letter = (char) (i + 'a');
                System.out.println(letter + " - " + letterCounts[i] + " разів");
            }
        }
    }
}
