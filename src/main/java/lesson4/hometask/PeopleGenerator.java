package lesson4.hometask;

import java.util.Random;

public class PeopleGenerator {

    public Person[] generatePeopleArray(int i){
    Person[] people = new Person[i];
        Random random = new Random();

        for (int j = 0; j < i; j++) {
            String name;
            int age = random.nextInt(100);
            boolean manOrWoman = random.nextBoolean();
            String sex = manOrWoman ? Sex.MAN : Sex.WOMAN;
        }

        return people;
    }
}
