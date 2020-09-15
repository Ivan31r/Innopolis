package lesson6.IO;

import java.io.*;
import java.nio.file.Path;

public class Main {
    private static final String PATH = "D:\\Innopolis\\Innopolis\\src\\main\\java\\lesson6\\IO\\person.txt";
    public static void main(String[] args) {

        final Person person = new Person("7",42,false);
        try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(new File(PATH)))){
            os.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
