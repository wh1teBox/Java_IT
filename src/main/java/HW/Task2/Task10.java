package HW.Task2;

public class Task10 {
    public static void main(String[] args) {
        final int height = 175;
        final int idealWeight= height - 110;

        int currentWeight=80;
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
