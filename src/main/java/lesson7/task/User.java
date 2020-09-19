package lesson7.task;

public class User implements Runnable {
    private  Store store;

    public User(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.takeGoods();
    }
}
