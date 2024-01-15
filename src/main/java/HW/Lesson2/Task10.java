package HW.Lesson2;

/**
 Завдання 10
 Напишіть програму розрахунку ідеальної ваги до зросту. В константах зберігаються зріст (height) і вага (weight).
 Виведіть в консоль повідомлення про те, скільки кілограм потрібно набрати або скинути (ідеальна вага = зріст - 110).
 */

public class Task10 {
    public static void main(String[] args) {
        final int height = 175;
        final int idealWeight= height - 110;

        int currentWeight= 75;
        int weightDifference = (currentWeight - idealWeight);

        if (weightDifference > 0) {
            System.out.println("Потрібно скинути " + weightDifference + " кг.");
        } else if (weightDifference < 0) {
            System.out.println("Потрібно набрати " + Math.abs(weightDifference) + " кг.");
        } else {
            System.out.println("Ви маєте ідеальну вагу.");
        }
    }
}
