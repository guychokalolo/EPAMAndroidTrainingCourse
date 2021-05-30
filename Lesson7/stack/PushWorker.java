package ru.guychokalolo.stack;

import static java.lang.Thread.sleep;

public class PushWorker implements Runnable{

    Stack stack;

    public PushWorker(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i<5; i++){

            try {
                sleep(3000);
                System.out.println(Thread.currentThread().getName()+ "  Push Add new element in Stack..... ");
            }catch (InterruptedException e){
                System.out.println("error in the PushWork class  ");
            }
            stack.push();
            System.out.println("Count of elements in stackPush = " + stack.element);
        }
    }
}
