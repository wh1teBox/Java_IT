package HW.Task3;

import java.util.Scanner;

public class Task4 {

    /*Завдання 4
Дана точка на площині задана координатами x та y. Визначіть і
виведіть в консоль, в якій чверті (у прямокутній (декартовій)
системі координат) знаходиться точка. Чверті позначені
римськими цифрами.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the x coordinate: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the y coordinate: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("The point is in the I quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("The point is in the II quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("The point is in the III quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("The point is in the IV quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println("The point is on the Y-axis.");
        } else if (x != 0 && y == 0) {
            System.out.println("The point is on the X-axis.");
        } else if (x == 0 && y == 0) {
            System.out.println("The point is at the origin (the starting point).");
        }

        scanner.close();
    }
}

