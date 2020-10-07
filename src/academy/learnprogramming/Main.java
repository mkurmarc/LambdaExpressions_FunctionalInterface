package academy.learnprogramming;
// lambda expressions use an interface with ONLY ONE abstract method.
public class Main {

    public static void main(String[] args) {
        // lambda using int value
        AnInterface square = n -> n * n;
        System.out.println(square.calculateSquare(5));

        // lambda using double value
        BInterface square2 = d -> d * d;
        System.out.println(square2.calculateSquare(100));

        // lambda using string object
        SInterface message1 = s -> "Hello " + s;
        System.out.println(message1.getMessage("meow"));

	    // void lambda expression with one parameter
        GeneralInterface message = s -> System.out.println("hello again " + s);
        message.displayMessage("Marc!");

        // int lambda expression with multiple parameters
        AnotherInterface sum = (n, p) -> n + p;
        System.out.println(sum.calculateSum(15, 100));

        // no parameter lambda expression
        CInterface newMessage = () -> System.out.println("Goodbye!");
        newMessage.displayMessage();
    }
}
