package cuncur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mian {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Counter counter = new Counter(new HashMap<>());
//        MyThread myThread = new MyThread(counter);
//        Thread thread = new Thread(myThread);
        List<MyThread> threads = Arrays.asList(new MyThread(counter),new MyThread(counter),new MyThread(counter));
        for (MyThread thread : threads){
            new Thread(thread).start();
        }
        for (MyThread thread : threads){
            System.out.println("thread = " + thread);
        }

    }
}
