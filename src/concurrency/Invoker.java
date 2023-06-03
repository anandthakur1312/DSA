package concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Invoker {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


    ExecutorService executorService
            = Executors.newFixedThreadPool(5);



        Callable<String> callableTask1 = () -> {
            String s = "Task's execution 1";
            TimeUnit.MILLISECONDS.sleep(3000);
            System.out.println(s);
            return s;
        };

        Callable<String> callableTask2 = () -> {
            TimeUnit.MILLISECONDS.sleep(3000);
            return "Task's execution 2";
        };

        Callable<String> callableTask3 = () -> {
            TimeUnit.MILLISECONDS.sleep(3000);
            return "Task's execution 3";
        };

        List<Callable<String>> callableTasks = new ArrayList<>();
        callableTasks.add(callableTask1);
        callableTasks.add(callableTask2);
        callableTasks.add(callableTask3);

//        List<Future<String>> futures = executorService.invokeAll(callableTasks);

        Future<String> future = executorService.submit(callableTask1);
        System.out.println(future.get() + " Main");


//        futures.forEach(f -> {
//            try {
//                System.out.println(f.get());
//            } catch (InterruptedException e) {
//
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        });

//        Thread.sleep(100);
//        executorService.shutdown();

//        runnables.forEach(r -> System.out.println(r.getClass().getName()));


//        Future<?> future = executorService.submit(Invoker::proxyRun);
//
//        System.out.println(future);


    }

    public static void proxyRun() {
        System.out.println("My run");
//        return "Return Value";
    }
}
