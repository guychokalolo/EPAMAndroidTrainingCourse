package ru.guychokalolo;

import static java.lang.Thread.sleep;

public class TryAgain implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "   Hello im a the TryAgain class..... ");
    }
}
