package ru.guychokalolo.executorservice;

public class MySingleExecutor implements Runnable{

    private String message;

    public MySingleExecutor(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) Task"+ message);
    }

}
