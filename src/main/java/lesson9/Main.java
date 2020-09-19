package lesson9;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
//        HashMap<String, String> stringStringHashMap = new HashMap<>();
//        System.out.println(String.class.getClassLoader());
//        System.out.println(stringStringHashMap.getClass().getClassLoader());
//        Class<?> board = new MyClass().findClass("");
//        System.out.println("board = " + board);
//        Object wow = board.getDeclaredConstructors()[0].newInstance("Wow",42);
//        System.out.println("wow = " + wow);
        JavaCompiler javac = ToolProvider.getSystemJavaCompiler();
        javac.run(null,System.out,System.err, "D:\\Innopolis\\Innopolis\\src\\main\\java\\lesson1\\Hello.java");
    }
}
