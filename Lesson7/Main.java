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
    public static void main(String[] args) {
        runFirstTack();
        runSecondTask();
        runMySingleExecutor();
        runMyFixedExecutor();
        runMyCachedThread();
        scheduledExecutor();
    }

    public static void runFirstTack(){
        trySameThing = new TrySameThing();
        Thread thread1 = new Thread(trySameThing);
        thread1.start();
        try {
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ "   I am the main Thread!!!!!");
    }

    public static void runSecondTask(){
        Stack stack = null;

        StackFactory stackFactory = new StackFactory();
        FutureTask<Stack> futureTask  = new FutureTask <>(stackFactory1);
        Thread thread = new Thread(futureTask);
        thread.start();

        try {
            stack = futureTask.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        PushWorker pushWorker = new PushWorker(stack);
        PopWorker popWorker = new PopWorker(stack);

        Thread thread1 = new Thread(pushWorker);
        Thread thread2 = new Thread(popWorker);
        thread1.start();
        thread2.start();

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread1.interrupt();
        thread2.interrupt();
        System.out.println(Thread.currentThread().getName()+ "   I am the main Thread !!!!!");
    }

    public static void runMySingleExecutor(){
        ExecutorService es = Executors.newSingleThreadExecutor();
        for(int i = 0; i< 3 ; i++){
            es.submit(new MySingleExecutor("" + i));
        }
        es.shutdown();

        while (!es.isTerminated()) {
            //waiting for executorService's tasks to finish
        }
        System.out.println("Finished Thread");
    }

    public static void runMyCachedThread(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i <= 3; i++) {
            MyCachedExecutor myCachedExecutor = new MyCachedExecutor();
            executorService.execute(myCachedExecutor);
        }
        executorService.shutdown();
    }

    public static void scheduledExecutor(){
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        MyTask task1 = new MyTask ("Demo Task 1");
        MyTask task2 = new MyTask ("Demo Task 2");
        MyTask task3 = new MyTask ("Demo Task 3");

        executorService.schedule(task1, 0,SECONDS);
        executorService.schedule(task2, 3,SECONDS);
        executorService.schedule(task2, 6,SECONDS);

        executorService.shutdown();
    }


    public static void runMyFixedExecutor(){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ArrayList<Callable<String>> callables = new ArrayList<>();
        for(int i = 0; i< 5; i++){
            callables.add(new Callable<String>() {
                @Override
                public String call() throws Exception {

                    return "callable " + Thread.currentThread().getName();
                }
            });
        }

        try {
            List<Future<String>> futures = executorService.invokeAll(callables);
            for (Future<String> future : futures) {
                System.out.println("result = " + future.get());
            }
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        executorService.shutdown();
        System.out.println("End of main thread");
    }

}





