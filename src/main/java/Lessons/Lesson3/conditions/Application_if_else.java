package Lessons.Lesson3.conditions;

public class Application_if_else {
    //syntax if
    // if(condition){
    // body
    // }

    public static void main(String[] args) {
        int condition = 8;
        int x = 2;

        if (x <= condition) {
            System.out.println(x + " less or more then " + condition);
        }

        //syntax if_else
        // if(condition){
        // } else {
        // else body
        // }

        if (x < condition || x > condition){
            System.out.println("< >");
        }else {
            System.out.println("Умова if не виконується");
        }
        //syntax else_if
        // if(condition){
        //     if body
        // }else if (condition){
        //     else_if body
        // }else if(condition){
        //     else_if body
        // } else{
        //     else body
        // }
        if ( x > condition){
            System.out.println(">");
        }else if (x < condition){
            System.out.println("<");
        } else {
            System.out.println("==");
        }


    }
}
