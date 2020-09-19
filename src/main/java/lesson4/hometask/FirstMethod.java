package lesson4.hometask;

import java.util.Arrays;
import java.util.Comparator;

public class FirstMethod implements Sort{


    public FirstMethod(){
    }

    public  void sortArray(Person[] people){
//        Arrays.sort(people, new PersonComparatorBySex().thenComparing(new PersonComparatorByAgeAndName()));
        Arrays.sort(people, new PersonComparatorBySex().thenComparing(new PersonComparatorByAge().thenComparing(new PersonComparatorByName())));
//        Arrays.sort();
    }
    public  void showRes(Person[]people){
        System.out.println(Arrays.toString(people));
    }

}
