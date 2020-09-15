package lesson4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] numbers = generateRandomNumbers("    N=10");
        System.out.println(Arrays.toString(numbers));
        double[] res = checkSqrtOfNumbers(numbers);
        System.out.println(Arrays.toString(res));


    }

    public static int[] generateRandomNumbers(String inputData) {
        String s = inputData.trim().replaceAll("\\D", "");
        int counter = Integer.parseInt(s);
        int[] numbers = new int[counter];
        Random random = new Random();
        for (int i = 0; i < counter; i++) {
            int k = random.nextInt();
            numbers[i] = k;
        }
        return numbers;

    }

    public static double[] checkSqrtOfNumbers(int[] numbers) {
        double[] tempArray = new double[10];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]<0){
                System.out.println("Число меньше нуля или NAN " + numbers[i]);
                continue;
            }
            double var = Math.sqrt(numbers[i]);
            double x1 = var-(int)var;
            int x2 = (int)(var-x1);

            if (x1*x1>numbers[i]){
                System.out.println("Выводим число на экран " + numbers[i]);
            }
            if (((int)x1*100) > x2 ){
                tempArray[counter]=numbers[i];
                counter++;
            }



        }

        return tempArray;

    }


}
