package ru.job4j.argMethod;

public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void answerAge(int age) {
        System.out.println("I am " + age + " years." );
    }


    public static void main(String[] args) {
        String name = "Alex Solopov";
        int age = 27;

        ArgMethod.hello(name + ". You " + age + " age");
        ArgMethod.answerAge(age);
        ArgMethod.hello(name);
        ArgMethod.hello(name);
    }
}
