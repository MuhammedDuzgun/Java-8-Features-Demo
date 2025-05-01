package lambdaexp;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class LambdaExpressionExample {

    public static void main(String[] args) {

        Shape rectangle = () -> System.out.println("Inside rectangle");
        rectangle.draw();

        Shape circle = () -> System.out.println("Inside circle");
        circle.draw();

        example(() -> System.out.println("Inside example"));

        Add add = (a, b) -> (a + b);
        int sum = add.add(4, 5);
        System.out.println("sum is : " +  sum);

        //creating Thread with lambda exp.
        Runnable runnable = () -> System.out.println("Inside runnable");
        Thread thread = new Thread(runnable);
        thread.start();

        MyFunctionalInterface myFunctionalInterface = (s) -> System.out.println(s);
        myFunctionalInterface.print("Hello World");

        //Supplier example
        Supplier<LocalDateTime> currentTime = () -> LocalDateTime.now();
        System.out.println("Current time : " + currentTime.get());
    }

    public static void example(Shape shape) {
        shape.draw();
    }

}
