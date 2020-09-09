package lesson3;

import java.text.MessageFormat;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] array = getSimpleNumber(10);
    System.out.println(Arrays.toString(array));

  }

  public static int[] getSimpleNumber(int i) {

    int[] simpleNumbers = new int[i];
    int count = 0;
    boolean isFound;
    if (i == 0) {
      return null;
    }
    for (int j = 2; j < i; j++) {
      isFound=true;
      for (int k = 2; k < j; k++) {
        if ((j%k)==0) {
          isFound=false;
        }
        if (isFound){
          simpleNumbers[count]=j;
          count++;
        }
      }
    }
    return simpleNumbers;
  }

}
