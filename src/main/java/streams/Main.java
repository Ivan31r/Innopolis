package streams;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Str1");
        list.add("Str2Str2");
        list.add("Str3Str3Str3");
        list.add("Str4Str4Str4Str4");
        list.add("Str5Str5Str5Str5Str5");

        list.forEach(System.out::println);

        Map<String,Integer> map = list.stream().collect(Collectors.toMap(String::toString,String::length));
        map.forEach((s, integer) -> {
            integer=integer+integer;
            System.out.println(s + " - " + integer);
        });
//
//        System.out.println(map);

    }
}
