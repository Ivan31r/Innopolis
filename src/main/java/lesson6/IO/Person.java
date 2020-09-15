package lesson6.IO;

import java.io.Serializable;

public class Person implements Serializable {
    private final String age;
    private final int name;
    private final  boolean bootsize;

    @Override
    public String toString() {
        return "Person{" +
                "age='" + age + '\'' +
                ", name=" + name +
                ", bootsize=" + bootsize +
                '}';
    }

    public String getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    public boolean isBootsize() {
        return bootsize;
    }

    public Person(String age, int name, boolean bootsize) {
        this.age = age;
        this.name = name;
        this.bootsize = bootsize;
    }
}
