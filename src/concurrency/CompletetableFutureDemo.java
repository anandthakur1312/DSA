package concurrency;

import java.util.concurrent.*;

public class CompletetableFutureDemo {

    public static Future<String> calculateAsync(String input) throws InterruptedException {
        CompletableFuture<String> completableFuture
                = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            Thread.sleep(500);
            if (input.equals("Cancel")) {
                completableFuture.cancel(false);
            } else {
                completableFuture.complete(input);
            }
            System.out.println(input + Thread.currentThread().getName());
            return null;
        });

        return completableFuture;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        try {
            Future<String> stringFuture = calculateAsync("Hello");
            if (stringFuture.get().equals("Hello")) {
                stringFuture = CompletableFuture.completedFuture("Hi");
            }
            System.out.println(Thread.currentThread().getName() + stringFuture.get());
        } catch (CancellationException ce) {
            System.out.println("Cancelled");
        }


        CompletableFuture<String> supplyFuture = CompletableFuture.supplyAsync(() -> {
            return "Hello From SupplyAsync";
        });
        System.out.println(supplyFuture.get());

        CompletableFuture<String> applyFuture = supplyFuture.thenApply(s -> {
            return s + " and from ApplyAsync";
        });

        CompletableFuture<String> suppluComposeFuture = supplyFuture.thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "after compose"));

        System.out.println(applyFuture.get());

        System.out.println(suppluComposeFuture.get());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
                .thenCombine(CompletableFuture.supplyAsync(() -> " World"), (s1, s2) -> s1 + s2);
        System.out.println(completableFuture.get() + " Combine");


    }


}

