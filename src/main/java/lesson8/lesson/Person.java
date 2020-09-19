package lesson8.lesson;

public final class Person {
    private int age;
    String name;
    protected Sex sex;
    public double temperature;

    public Person(int age, String name, Sex sex, double temperature) {
        this.age = age;
        this.name = name;
        this.sex = sex;
        this.temperature = temperature;
    }

}
