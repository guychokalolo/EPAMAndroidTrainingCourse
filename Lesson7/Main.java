package ru.guychokalolo;

import ru.guychokalolo.executorservice.MyCachedExecutor;
import ru.guychokalolo.executorservice.MyScheduledExecutor;
import ru.guychokalolo.executorservice.MySingleExecutor;
import ru.guychokalolo.stack.PopWorker;
import ru.guychokalolo.stack.PushWorker;
import ru.guychokalolo.stack.Stack;
import ru.guychokalolo.stack.StackFactory;

import java.util.concurrent.*;

public class Main {

    public static TrySameThing trySameThing;
    public static TryAgain tryAgain;

    public static void main(String[] args) {
        runFirstTack();
        runSecondTask();
        runMySingleExecutor();
        runMyFixedExecutor();
        runMyCachedThread();
        scheduledExecutor();
    }

    public static void runMySingleExecutor(){
        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i = 1; i< 4 ; i++){
            es.submit(new MySingleExecutor("" + i));
        }
        es.shutdown();

        while (!es.isTerminated()) {   }

        System.out.println("Finished Thread");
    }


    public static void runMyCachedThread(){

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        for (int i = 1; i <= 3; i++) {
            MyCachedExecutor myCachedExecutor = new MyCachedExecutor();
            threadPoolExecutor.execute(myCachedExecutor);
        }
        threadPoolExecutor.shutdown();
    }


    public static void scheduledExecutor(){
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        MyScheduledExecutor task1 = new MyScheduledExecutor ("Demo Task 1");
        MyScheduledExecutor task2 = new MyScheduledExecutor ("Demo Task 2");

        executor.schedule(task1, 3, TimeUnit.SECONDS);
        executor.schedule(task2, 3 , TimeUnit.SECONDS);

        executor.shutdown();
    }


    public static void runFirstTack(){
        trySameThing = new TrySameThing();
        tryAgain = new TryAgain();

        trySameThing.start();
        tryAgain.start();

        if(trySameThing.isAlive() || tryAgain.isAlive()){
            try {
                trySameThing.join();
                tryAgain.join();
            }catch (InterruptedException e){

            }
        }

        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+ "   I am the main Thread!!!!!");
        }catch (InterruptedException e){
            System.out.println("error in the main Thread ");
        }
    }

    public static void runSecondTask(){
        Stack stack = new Stack();
        StackFactory stackFactory = new StackFactory(stack);
        PushWorker pushWorker = new PushWorker(stack);
        PopWorker popWorker = new PopWorker(stack);

        Thread thread = new Thread(stackFactory);
        Thread threadPush = new Thread(pushWorker);
        Thread threadPop = new Thread(popWorker);

        thread.start();
        threadPush.start();
        threadPop.start();

        System.out.println(Thread.currentThread().getName()+ "   I am the main Thread !!!!!");
    }


    public static void runMyFixedExecutor(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<String> future2 = executorService.submit(new Callable<String>() {
            public String call() throws Exception {
                int i = 0;
                System.out.println("Start Task 1");
                while (i < 10 && !Thread.currentThread().isInterrupted()) {
                    Thread.sleep(1000);
                    i++;
                }
                System.out.println("End Task 1");
                return "Task 1";
            }
        });

        Future<String> future3 = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                int i = 0;
                System.out.println("Start Task 3");
                while (i< 10 && !Thread.currentThread().isInterrupted()){
                    Thread.sleep(500);
                    i++;
                }
                System.out.println("End Task 3");
                return "Task 3";
            }
        });

        Future<String> future1 = executorService.submit(new Callable<String>() {
            public String call() throws Exception {
                int i = 0;
                System.out.println("Start Task 2 ");
                while (i < 10 && !Thread.currentThread().isInterrupted()) {
                    Thread.sleep(500);
                    i++;
                }
                System.out.println("End Task 2");
                return "Task 2";
            }
        });

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.HOURS);
            System.out.println("result1 = " + future1.get());
            System.out.println("result2 = " + future2.get());
            System.out.println("result3 = " + future3.get());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } catch (ExecutionException ee) {
            ee.printStackTrace();
        }
    }
}





