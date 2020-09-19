package lesson8.task;

import java.io.Serializable;

public class ClassForSerialize extends ParentOfSerializableClass implements Serializable {
    private int number;
    private int counter;
    private static final long serialVersionUID = 101L;

    public ClassForSerialize(int number, int counter,String name) {
        super(name);
        this.number = number;
        this.counter = counter;
    }
    private void doSomething (){

    }

    @Override
    public String toString() {
        return "ClassForSerialize{" +
                "number=" + number +
                ", counter=" + counter +
                '}';
    }
}
