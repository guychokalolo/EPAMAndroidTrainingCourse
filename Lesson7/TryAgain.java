package ru.guychokalolo;

import static java.lang.Thread.sleep;

public class TryAgain extends Thread{

    @Override
    public void run() {
        try {
            sleep(5000);
            System.out.println(Thread.currentThread().getName()+ "   Hello im a the TryAgain class..... ");
        }catch (InterruptedException e){
            System.out.println("error in the TryAgain class");
        }
    }
}
