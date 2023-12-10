package Lessons.Lesson2;

public class Practice2 {
    public static void main(String[] args) {
        int x = 3;
        int y = ++x * 2;//7
        System.out.println(x);//4
        x += -y * 3 + ++x + --y;//4 =-24 =-20-> -20+5+7 = -8
        System.out.println(y);//7
        System.out.println(x);//-8
        y += (-x++) % 3;//9
        int z = x + y;//2
        System.out.println(z);
    }
}
