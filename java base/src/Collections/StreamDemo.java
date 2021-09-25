package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        Map<String ,String> people=new HashMap<>();
        people.put("Surbhi","Noida");
        people.put("Sejal","Pune");
        people.put("Akanksha","Gurugram");

        people.values().forEach(System.out::println);

        List<String> cities= people.values().stream().sorted().collect(Collectors.toList());
        cities.forEach(System.out::println);

        Map<String,List<String >> contacts = new HashMap<>();
        contacts.put("Surbhi", Arrays.asList("920839814","132142354"));
        contacts.put("Sejal", Arrays.asList("13425345","32424532"));
        contacts.put("Akanksha", Arrays.asList("325646756","65757547"));

        contacts.values().stream().flatMap(Collection::stream).forEach(System.out::println);
     }
}
