package multiThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String URL = "https://raw.githubusercontent.com/Ivan31r/Innopolis/master/prop.properties";
    public static void main(String[] args) throws IOException {



    }
    public List<String> getURLs(String Path){
        List<String > listURLs = new ArrayList<>();
        try {
            URL url = new URL(Path);
            String line;
            InputStream inputStream = url.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                listURLs.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return listURLs;
    }
}
