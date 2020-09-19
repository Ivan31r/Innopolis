package lesson7.task;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Thread thread = new Thread(new Consumer(store));
        Thread thread1 = new Thread(new User(store));
        Thread thread2 = new Thread(new Consumer(store));
        thread.setDaemon(false);
        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("finish");
    }
}
