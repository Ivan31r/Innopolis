package testPack;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class simpleAlgorithms {
    public static void main(String[] args) {

        int[] testArray = {1,5, 2, 7, 6, 4, 9, 10, 3};
        System.out.println(Arrays.toString(testArray));
        selectSort(testArray);
        System.out.println(Arrays.toString(testArray));



    }



    public static void bobbleSort(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            while (i > 0 && arr[i - 1] > temp) {
                arr[i] = arr[i - 1];
                --i;
            }
            arr[i] = temp;
        }
    }

    public static void binarySearch(int[]arr, int number){
        int left=0;
        int right=arr.length;
        int counter =0;
        for (int i = left; i < right; i++) {
            counter++;
            int middle=(left+right)/2;
            if (arr[middle]==number){
                System.out.println("Bingo");
                System.out.println("counter = " + counter);
                return;
            }
            if (arr[middle]<number){
                left=middle;
            }else {
                right=middle;
            }

        }
        System.out.println("=(");
        System.out.println("counter = " + counter);

    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {    //проходим по нашему массиву

            int minValue = array[i];     //формально минимальное значение = i элемент
            int minIndex = i;               //формально минимальный индекс = i

            for (int j = i + 1; j < array.length; j++) {    //внутренний цикл
                if (array[j] < minValue) {      //по сути сравниваем i+1 и i
                    minValue = array[j];           //если условие выполнилось, в записываем новое минимальное значение
                    minIndex = j;                   //и новый минимальынй индекс
                }
            }
            int temp = array[i];                          //
            array[i]=minValue;
            array[minIndex]=temp;



        }
    }
}
