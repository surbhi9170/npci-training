package Collections;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cart inventory=new Cart();
        inventory.add("apples",10);
        inventory.add("banana",10);
        inventory.add("oranges",10);
        inventory.add("kiwi",10);
        inventory.add("strawberry",10);
        System.out.println("Items available: ");
        inventory.get();
        inventory.add2Cart("apples",4);
        inventory.add2Cart("oranges",4);
        inventory.add2Cart("banana",4);
        inventory.add2Cart("grapes",4);
        inventory.displayCart();

        //collections by zubair
        Integer[] ar={1,2,3,4,21,13};
        List<Integer> list= Arrays.asList(ar);
        System.out.println(list);
        System.out.println(ar);
        Stream<Integer> str1= list.stream();
        str1.forEach(System.out::println);
        list.stream().forEach(System.out::println);
        list.stream().distinct().forEach(System.out::println);
        System.out.println(IntStream.range(0,99).count());
        IntSummaryStatistics stats=IntStream.of(2,4,3,2,5,2,1).summaryStatistics();
        System.out.println(stats);
    }
}
