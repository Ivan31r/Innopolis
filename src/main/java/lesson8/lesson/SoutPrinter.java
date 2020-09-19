package lesson8.lesson;

import lesson8.lesson.Printer;

public class SoutPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
