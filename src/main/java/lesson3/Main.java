package lesson3;

import java.text.MessageFormat;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = getSimpleNumber(100);
        System.out.println(Arrays.toString(array));

    }

    public static int[] getSimpleNumber(int i) {
        int[] simpleNumbers = new int[10];
        int counter = 0;
        boolean isFind;

        for (int j = 2; j < i; j++) {
            isFind = true;
            for (int k = 2; k <= j; k++) {
                if (j % k == 0 && j != k) {
                    isFind = false;
                    break;
                }
            }
            if (isFind) {

                if (counter>=simpleNumbers.length){
                    simpleNumbers = Arrays.copyOf(simpleNumbers,simpleNumbers.length*2);
                }
                simpleNumbers[counter] = j;
                counter++;
            }
        }

        int[]numbers=new int[counter];
        System.arraycopy(simpleNumbers,0,numbers,0,counter);

        return numbers;


    }

}
