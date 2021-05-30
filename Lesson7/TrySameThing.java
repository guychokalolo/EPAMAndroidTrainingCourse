package ru.guychokalolo;

import static java.lang.Thread.sleep;

public class TrySameThing extends Thread{

    @Override
    public void run() {
        //for (int i = 0; i < 3; i++)
            try {
                sleep(1000);
                System.out.println(Thread.currentThread().getName()+ "   Hello im a the TrySameThing class..... ");
            }catch (InterruptedException e){
                System.out.println("error in the TrySameThing class  ");
            }
    }
}
