package ru.guychokalolo.executorservice;

public class MyScheduledExecutor implements Runnable{

    String nameTask;

    public MyScheduledExecutor(String nameTask) {
        this.nameTask = nameTask;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +  "(Start) Task =" + nameTask);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
