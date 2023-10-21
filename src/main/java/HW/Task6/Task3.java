package HW.Task6;

public class Task3 {
    /*Напишіть програму, яка перевіряє, чи всі значення елементів масиву однакові.
    Виведіть: Yes — якщо всі однакові, і No — якщо є хоч одна відмінність.
    Задайте та ініціалізуйте масив на початку програми.*/

    public static void main(String[] args) {
        int[] array = {2, 2, 2, 2, 2};

        boolean allEqual = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[0]) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
