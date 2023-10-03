package HW.Task1;

public class Task1 {
    /**
     *
     * starting point for program execution
     */
    public static void main(String[] args) {
        String name = "Oksana";
        String city = "Lviv";
        int age = 30;
        String university = "Lviv Polytechnic National University";
        String pet = "cat";
        String petName = "Martin";
        String hobby = "travelling";
        String professional = "junior software developer";

        System.out.println(
                "My name is " + name + ". I was born and raised in " + city + ". I’m in my early " + age +
                        ". Studied chemistry at \n" + university + ". I have, " + pet + " his name is " + petName + ". I am very sociable, so I have many friends. \nI have a large and friendly family, with whom I also like to spend my free time. My hobby is " + hobby +". \nNow I'm working in an IT company as a " + professional
                          + ". \nI start this course to improve my knowledge and get some more information");
    }
}
