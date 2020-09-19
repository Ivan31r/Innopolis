package cuncur;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {
    private int food =0;
    private String name = "";
    private final Semaphore semaphore;

    public Philosopher(Semaphore semaphore,String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
            try {
                while (food<5){
                    System.out.println(String.format("Ф %s пришел", name));
                    semaphore.acquire();
                    System.out.println(String.format("Ф %s сел за стол", name));
                    Thread.sleep(1000);
                    food++;
                    System.out.println(String.format("Ф %s пошел думать",name ));
                    semaphore.release();
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                System.out.println(String.format("Филосов приуныл %s",name));

            }
    }
}
