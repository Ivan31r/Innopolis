package lesson7.readFromUrl;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String Path = "https://raw.githubusercontent.com/Ivan31r/Innopolis/master/prop.properties";
    public static void main(String[] args) throws IOException {
        List<String> pathOfDictionaries = readPropertyFromUrl(Path);
        List<String> firstUrl = readPropertyFromUrl(pathOfDictionaries.get(0));
        List<String> secondUrl = readPropertyFromUrl(pathOfDictionaries.get(1));
        List<String> thirdUrl = readPropertyFromUrl(pathOfDictionaries.get(2));
        List<String> fourthUrl = readPropertyFromUrl(pathOfDictionaries.get(3));
        List<String> fifthUrl = readPropertyFromUrl(pathOfDictionaries.get(4));

        pathOfDictionaries.forEach(System.out::println);



    }






    public static List<String> readPropertyFromUrl(String path) {
        List<String> pathOfFiles = new ArrayList<>();
        try {
            URL url = new URL(path.trim());
            String line;
            InputStream inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                pathOfFiles.add(line);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return pathOfFiles;
    }
}
