package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6);
        List<Integer> integerList = integerStream.toList();
        List<Integer> list = Arrays.asList(2,3,5,6,8,4);
        Predicate<Integer> p = integer -> integer % 2 == 0;
        list.stream().filter(p).forEach(System.out::println);
    }
}
