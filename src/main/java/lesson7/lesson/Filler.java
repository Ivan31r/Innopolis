package lesson7.lesson;

public class Filler implements Runnable{
    private final Store store;

    public Filler(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.fillGoods();
    }
}
