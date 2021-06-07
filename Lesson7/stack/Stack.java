package ru.guychokalolo.stack;

public class Stack {

    private int count = 0;

    public synchronized void push(){
        while (count != 0){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Interruption..");
            }
        }
        System.out.println(Thread.currentThread().getName()+ "  Push Add new element in Stack..... ");
        count++;
        notify();
    }
    public synchronized void pop(){
        while (count == 0){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println("Interruption..");
            }
        }
        System.out.println(Thread.currentThread().getName()+ "  Delete element in Stack..... ");
        count--;
        notify();
    }
}
