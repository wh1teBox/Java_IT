package Lessons.lesson6;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scanner.nextInt();

        String[] colors = new String[size];

        for(int i = 0; i< colors.length; i++){
            System.out.println("Enter color");
            colors[i] = scanner.next();
        }
        for (int i = 0; i < colors.length; i++) {
            System.out.println("color: " + colors[i]);
        }
    }

}

