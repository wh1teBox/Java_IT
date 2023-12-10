package Lessons.Lesson2;

public class Operators {
    public static void main(String[] args) {

        //Arithmetic
        int first = 17;
        int second = 10;

        System.out.println(first / second);
        System.out.println(first % second);

        System.out.println("increment");
        int count = 9;
        System.out.println("count = "+ count);
        System.out.println("count = "+ count++); // postfix
        System.out.println("count = "+ count);
        System.out.println("count = "+ ++count);// prefix


        System.out.println("decrement");
        int count1 = 10;
        System.out.println("count = "+ count1);
        System.out.println("count = "+ count1--); // postfix
        System.out.println("count = "+ count1);
        System.out.println("count = "+ --count1);// prefix

        //Операції порівняння
        System.out.println(" > " + (first > second));// більше
        System.out.println(" < " + (first < second));// менше
        System.out.println(" >= " + (first >= second));// більше дорівнює
        System.out.println(" <= " + (first <= second));// менше дорівнює
        System.out.println(" == " + (first == second));// дорівнює
        System.out.println(" != " + (first != second));// не дорівнює

        //логічні оператори
        boolean res1 = 3 <= (2 + 30) % 7 && 5 >= 10 / 2;
        System.out.println(res1);

        boolean res2 = !true || false && true;
        System.out.println(res2);

        // оператори += *= /= -=
        // збільшити число на 10
        int num = 10;
        num += 10;
        System.out.println(num);






    }
}
