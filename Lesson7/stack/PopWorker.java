package ru.guychokalolo.stack;

import static java.lang.Thread.sleep;

public class PopWorker implements Runnable {

    private Stack stack;

    public PopWorker(Stack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 0; i<5; i++){
            stack.pop();
        }
    }
}
