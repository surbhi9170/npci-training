package Collections.StreamExample;

import Collections.LinkedList;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightStream {
    public static void main(String[] args) throws Exception {
        List<Flight> flights=new ArrayList<Flight>();
        Stream<String> lines= Files.lines(Paths.get("src/Collections/StreamExample/Flights.txt"));
        flights = lines.map(l -> {
            String[] a= l.split(",");
            return new Flight(Integer.parseInt(a[0]),a[1],a[2],a[3]);
        }).collect(Collectors.toList());
        //flights.forEach(System.out::println);

        flights.stream().filter(f -> f.getSource().equals("hyd") && f.getDestination().equals("kol")).forEach(System.out::println);
    }
}
