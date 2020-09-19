package lesson4.hometask;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Person[] people = new Person[6];
        Person person1 = new Person(20, "Vasya", Sex.MAN);
//        Person person6 = new Person(20, "Vasya", Sex.MAN);
        Person person2 = new Person(10, "Alex", Sex.MAN);
        Person person6 = new Person(40, "Alex", Sex.MAN);
        Person person3 = new Person(20, "Masha", Sex.WOMAN);
        Person person4 = new Person(40, "Ivan", Sex.MAN);
        Person person5 = new Person(50, "Tanya", Sex.WOMAN);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        people[5] = person6;
//        people[5] = person6;

        System.out.println(Arrays.toString(people));
        Arrays.sort(people,new PersonComparatorByAge());
        Arrays.sort(people,new PersonComparatorByName());
        System.out.println(Arrays.toString(people));

//        long start = System.currentTimeMillis();
//        FirstMethod firstMethod = new FirstMethod();
//        firstMethod.sortArray(people);
//        long and = System.currentTimeMillis() - start;
//        firstMethod.showRes(people);
//        System.out.println("Total time = " + and + "ms");


    }


}
