package ru.guychokalolo.executorservice;

public class MyTask implements Runnable{

    private String nameTask;

    public MyTask(String nameTask) {
        this.nameTask = nameTask;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  "(Start) Task =" + nameTask);
    }
}
