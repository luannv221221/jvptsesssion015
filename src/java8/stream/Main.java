package java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(6);
        numbers.add(8);

        //đếm so chia het cho 2
        int count = 0;
        for (Integer number : numbers) {
            if(number % 2 == 0)
                count++;
        }

        System.out.println(count);
        long count1 = numbers.stream().filter(num->num%2==0).count();
        System.out.println(count1);
    }
}
