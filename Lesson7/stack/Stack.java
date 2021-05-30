package ru.guychokalolo.stack;

public class Stack {

    public int element = 0;

    public synchronized void push(){
        while (element >= 4){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Interruption..");
            }
        }
        element++;
        notify();
    }
    public synchronized void pop(){
        while (element < 1){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Interruption..");
            }
        }
        element--;
        notify();
    }
}
