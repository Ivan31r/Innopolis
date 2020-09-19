package cuncur;

import java.util.concurrent.CountDownLatch;

public class CntDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(5);
        System.out.println("start");
        Thread thread = new Thread(new MyThread(countDownLatch));
        Thread thread1 = new Thread(new MyThread(countDownLatch));
        thread.start();
        thread1.start();
        countDownLatch.await();
        System.out.println("finish");

    }
    private static class MyThread implements Runnable{
        private final CountDownLatch latch;

        public MyThread(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.printf("name=%s, i=%d\n", Thread.currentThread().getName(),i);
                latch.countDown();
            }
        }
    }
}
