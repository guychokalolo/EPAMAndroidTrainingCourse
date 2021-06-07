package ru.guychokalolo.executorservice;

public class MyCachedExecutor implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
