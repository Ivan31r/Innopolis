package algorithmsAndDataStructures;

import java.util.Arrays;

public class Main {

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
    for (int i = 0; i < array.length; i++) {

      int minValue = array[i];
      int minIndex = i;
      boolean isSorted = true;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < minValue) {
          minValue = array[j];
          minIndex = j;
          isSorted = false;
        }
      }

      while (!isSorted) {
        int var = array[i];
        array[i] = array[minIndex];
        array[minIndex] = var;
        isSorted = true;
      }

    }
  }

}
