package ru.guychokalolo.stack;

import static java.lang.Thread.sleep;

public class PopWorker implements Runnable {

    Stack stack;
    public PopWorker(Stack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 1; i<5; i++){
            try {
                sleep(3000);
                System.out.println(Thread.currentThread().getName()+ "  Pop remove element from Stack..... ");
            }catch (InterruptedException e){
                System.out.println("error in the PopWorker class  ");
            }
            stack.pop();
            System.out.println("Count of elements in stackPop = " + stack.element);
        }
    }
}
