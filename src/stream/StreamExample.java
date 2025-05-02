package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Grape");
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Watermelon");

        List<String> list = fruits.stream()
                .map(String::toUpperCase)
                .limit(5)
                .toList();

        list.forEach(System.out::println);

        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> integerList = nums.stream()
                .filter(i -> i > 2)
                .limit(5)
                .toList();
        integerList.forEach(System.out::println);

    }
}
