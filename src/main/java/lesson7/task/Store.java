package lesson7.task;

public class Store {
    private static final int MAX_OPERATION = 10;
    private static int goods;
    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();

    public  void addGoods() {
        synchronized (lock1) {
            synchronized (lock2){

            }
            try {
                lock1.wait();
                for (int i = 0; i < 1000000000; i++) {
                    goods++;
                }
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        lock2.notify();

    }
    public  void takeGoods() {
        synchronized (lock2) {
            synchronized (lock1){

            }
            try {
                lock2.wait();
                for (int i = 0; i < MAX_OPERATION; i++) {
                    goods--;
                }
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
        lock1.notify();

    }
}
