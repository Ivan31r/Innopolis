package lesson7.lesson;

import java.util.concurrent.Callable;

public class Auditor implements Callable<Integer> {
    public Store store;

    public Auditor(Store store) {
        this.store = store;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10000);
        return store.getGoods();
    }
}
