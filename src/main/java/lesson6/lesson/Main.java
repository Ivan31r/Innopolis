package lesson6.lesson;

import java.io.*;
import java.util.Properties;
import java.util.Random;

public class Main {
    private static final String PATH = "D:/Innopolis/Innopolis/src/main/java/lesson6/hello.txt";

    public static void main(String[] args) {







    }
    private static void readData(){
        try (final Reader reader = new FileReader(PATH)) {
            final Properties properties = new Properties();
            System.out.println(properties);
            properties.load(reader);
            System.out.println(properties);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
