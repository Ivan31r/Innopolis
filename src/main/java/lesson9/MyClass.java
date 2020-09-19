package lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClass extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            if (name.toLowerCase().contains("Board")) {
                byte[] bytes = Files.readAllBytes(Paths.get("Board.class"));
                return defineClass(name,bytes,0,bytes.length);
            }
            return null;
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
