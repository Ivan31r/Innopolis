package lesson12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println(scanner.nextLine());
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i % 10, i);
        }
        System.out.println("list = " + list);
    }

}
