package HW.Task7;

import java.util.ArrayList;
import java.util.Random;

public class Task6 {
    /*Завдання 6
Заповніть масив з 10 елементів випадковими числами від -10 до
+10. Підрахуйте кількість унікальних значень (що зустрічаються
в масиві один раз). Виведіть в консоль значення унікальних
елементів та індекси, під якими вони знаходяться в масиві.*/
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21) - 10;
        }

        ArrayList<Integer> uniqueValues = new ArrayList<>();
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!uniqueValues.contains(array[i])) {
                uniqueValues.add(array[i]);
                indexes.add(i);
            }
        }

        for (int j = 0; j < uniqueValues.size(); j++) {
            int value = uniqueValues.get(j);
            int index = indexes.get(j);
            System.out.println("Значення: " + value + ", Індекс: " + index);
        }
    }
}
