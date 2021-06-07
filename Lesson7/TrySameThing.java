package ru.guychokalolo;

import static java.lang.Thread.sleep;

public class TrySameThing implements Runnable{

    private Thread thread;

    @Override
    public void run() {
            try {
                System.out.println(Thread.currentThread().getName()+ "   Hello im a the TrySameThing class..... ");
                sleep(5000);
                thread = new Thread(new TryAgain());
                thread.start();
                thread.join();
            }catch (InterruptedException e){
                System.out.println("error in the TrySameThing class  ");
            }
    }
}
