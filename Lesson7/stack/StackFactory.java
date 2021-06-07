package ru.guychokalolo.stack;

public class StackFactory implements Runnable {

    private Stack stack;

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  Thread init StackFactory");
        return new Stack();
    }
}
