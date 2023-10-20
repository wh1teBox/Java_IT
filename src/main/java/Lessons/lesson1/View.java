package Lessons.lesson1;

public class View {
    public static void main(String[] args) {
        String name = "Jack";
        int num =35;

        System.out.println("My name is " + name + ". I am a human.");// + concat
        System.out.println("I'm "+ num + " years old.");
        System.out.print("Я не перекидаю на новий рядок. ");
        System.out.println("Я на цьому ж рядку");

        System.out.printf("My name is %s. I am a human.\n", name);
        //змінна name буде підставлятись у значення %s, використовується тільки для printf
        System.out.printf("I'm %d years old.", num);
        //printf - не переносить на новий рядок
        // \n - перехід на новий рядок

    }
}
