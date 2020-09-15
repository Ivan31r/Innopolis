package algorithmsAndDataStructures.simpAlgorithms.testAlgorithms;

import java.util.Arrays;

public class Algorithms {

    public static void main(String[] args) {
        int[] array = {3, 8, 5, 1, 11, 64, 21, 9};
        System.out.println(Arrays.toString(array));
//    bubbleSort(array);
//    selectSort(array);
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int var = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = var;
                }
            }
        }
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {    //проходим по нашему массиву

            int minValue = array[i];     //формально минимальное значение = i элемент
            int minIndex = i;               //формально минимальный индекс = i
//            boolean isSorted = true;        //флаг сортировки

            for (int j = i + 1; j < array.length; j++) {    //внутренний цикл
                if (array[j] < minValue) {      //по сути сравниваем i+1 и i
                    minValue = array[j];           //если условие выполнилось, в записываем новое минимальное значение
                    minIndex = j;                   //и новый минимальынй индекс
//                    isSorted = false;               //флаг меняем на фолс, т.к. у нас новое минимальное значение
                }
            }
            int temp = array[i];
            array[i]=minValue;
            array[minIndex]=temp;

//            while (!isSorted) {                     //если флаг был изменен( а он будет изменен), то
//                int var = array[i];                 //делаем временную переменную, в которой будет минимальное значение
//                array[i] = array[minIndex];             //делаем
//                array[minIndex] = var;
//                isSorted = true;
//            }

        }
    }


}
