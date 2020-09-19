package lesson7.task2;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            URL url = new URL("https://raw.githubusercontent.com/Ivan31r/Innopolis/master/prop.properties");
            String line;
            InputStream inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append(System.lineSeparator());
            }
        }catch (Exception e){
            e.getMessage();
        }

        System.out.println(stringBuilder.toString());

    }
}
