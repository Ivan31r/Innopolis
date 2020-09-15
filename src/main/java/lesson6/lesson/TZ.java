package lesson6.lesson;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TZ {
    public static void main(String[] args) {
        String line = " а б в г д е ж з и к л м н а б в г д а а а а ";
//    String varLine = line.replaceAll("\\p{Punct}"," ");
//        System.out.println(varLine);
//    String[] var = varLine.trim().split("\\p{Punct}");
//        System.out.println(Arrays.toString(var));
//        System.out.println(Arrays.toString(var));
        frequency(line);


    }

    public static void frequency(String line) {
        String varLine = line.replaceAll("\\p{Punct}", " ");
        String[] varString = varLine.trim().split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        for (int i = 0; i < varString.length; i++) {
            if (freq.containsKey(varString[i])) {
                freq.put(varString[i], freq.get(varString[i]) + 1);
            } else {
                freq.put(varString[i], 1);
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> pair : freq.entrySet()) {
            count += pair.getValue();
        }
        System.out.println("size " + freq.size());
        System.out.println("count = " + count);

        for (Map.Entry<String, Integer> pair : freq.entrySet()) {
            System.out.println(pair.getKey() + " - " + (int)((pair.getValue()/(double)count)*100));
        }
    }
}
