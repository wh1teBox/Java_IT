package Lessons.lesson10.stringBufferBuilder;

public class BuilderBufferExample {
    public static void main(String[] args) {

        String str = "Hello";
        str = str + " " + "Jack";
        str += " How are you";

        System.out.println(str);

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("capacity() = " + stringBuilder.capacity());
        stringBuilder.append(" ");
        stringBuilder.append("I am fine!!!!!!!");
        System.out.println("capacity() = " + stringBuilder.capacity());
        stringBuilder.delete(6, 11);
        stringBuilder.insert(6, "Max ");
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
