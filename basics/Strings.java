package basics;

public class Strings {
    public static void main(String[] args) {
        String greeting = "Hello, World! ";
        System.out.println(greeting + System.identityHashCode(greeting));


        greeting = greeting.concat("greeting");
        System.out.println(greeting + System.identityHashCode(greeting));
    }
}
