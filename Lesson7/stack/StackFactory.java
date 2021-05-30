package ru.guychokalolo.stack;

public class StackFactory implements Runnable {

    Stack stack;

    public StackFactory(Stack stack){
        this.stack = stack;
    }


    @Override
    public void run() {
        System.out.println("Thread init StackFactory");
    }
}
