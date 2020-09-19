package lesson7.lesson;

public class Store {
    private int goods = 0;
    private static final int MAX_OPERATION = 3;

    public synchronized void fillGoods() {
        for (int i = 0; i < MAX_OPERATION; i++) {
            System.out.println("Пополняем: " + ++goods);
        }
        notify();
    }

    public synchronized void sellGoods() {
        try {
            wait();
            for (int i = 0; i < MAX_OPERATION; i++) {
                System.out.println("Осталось: " + --goods);
            }
        }catch (InterruptedException e){
            e.getMessage();
        }
    }

    public int getGoods() {
        return goods;
    }


}
