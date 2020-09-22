package lesson11;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MyBestClass {
    boolean flag;

    public MyBestClass(boolean flag) {
        this.flag = flag;
    }
    public Optional<String> getId(){
        if (flag){
            return Optional.empty();
        }
        return Optional.of("42");
    }
}
