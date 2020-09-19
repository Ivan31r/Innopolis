package cuncur;

import java.util.concurrent.Semaphore;

public class SemTest {
    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(2);
        for (int i = 0; i < 5; i++) {

             new Philosopher(semaphore, "Василий-"+i).start();
        }
    }
}
