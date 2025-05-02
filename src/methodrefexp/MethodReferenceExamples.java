package methodrefexp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class MethodReferenceExamples {

    public void display(String s) {
        String upperS = s.toUpperCase();
        System.out.println(upperS);
    }

    public static void main(String[] args) {

        //1. method ref to a static method
        // lambda exp
        Function<Integer, Double> getSquareRoot = (num) -> Math.sqrt(num);
        System.out.println(getSquareRoot.apply(4));

        //method ref
        Function<Integer, Double> getSquareRootMetRef = Math::sqrt;
        System.out.println(getSquareRootMetRef.apply(4));


        //2. Method ref. to an instance of an object
        MethodReferenceExamples me = new MethodReferenceExamples();

        //lambda exp
        Printable printable = (s) -> me.display(s);
        printable.print("hello, world");

        //method ref
        Printable printableMetRef = me::display;
        printableMetRef.print("hello, world");


        //3. Reference to the instance method of an orbitary object

        //lambda exp
        Function<String, String> strFunction = (str) -> str.toLowerCase();
        System.out.println(strFunction.apply("hello, world"));

        //method ref
        Function<String, String> strFunctionMetRef = String::toLowerCase;
        System.out.println(strFunctionMetRef.apply("hello, world"));

        //4. Reference to a constructor

        //lambda exp
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");

        Function<List<String>, Set<String>> convertToSet = (list) -> new HashSet<>(list);
        convertToSet.apply(fruits);
        System.out.println(fruits);

        //method ref
        Function<List<String>, Set<String>> convertToSetMetRef = HashSet::new;
        convertToSetMetRef.apply(fruits);
        System.out.println(fruits);
    }
}
