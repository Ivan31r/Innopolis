package Intuit;

public class Main {
    public static void main(String[] args) {
        num:
        for (int num = 2; num <= 100; num++) {
            int n = (int)Math.sqrt(num)+1;
            while (--n != 1) {
                if (num%n==0) {
                    System.out.print("num % n :" + "num=" + num + "n=" + n + " | ");
                    continue num;
                }
            }
            System.out.print(num+" ");
        }
    }
}
