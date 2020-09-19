package lesson7.lesson;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Process {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Store store = new Store();
        Customer customer = new Customer(store);
        Filler supplier = new Filler(store);

        new Thread(customer).start();
        new Thread(supplier).start();
        new Thread(supplier).start();
        new Thread(supplier).start();
        FutureTask<Integer> task = new FutureTask<Integer>(new Auditor(store));
        new Thread(task).start();
        System.out.println(task.get());
        System.out.println("Finish");

    }
}
