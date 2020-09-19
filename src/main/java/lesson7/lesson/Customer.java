package lesson7.lesson;

public class Customer implements Runnable {
    private final Store store;

    public Customer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.sellGoods();
    }
}
