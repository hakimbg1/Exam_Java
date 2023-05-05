package m1.executors;

import m1.lamba.LongTask;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDemo {
    //
    public static int toFahrenheit(int celsius){
        return (int)(celsius * 1.8) + 32;
    }

    public static CompletableFuture<String> getUserEmailAsync(){
        return CompletableFuture.supplyAsync(()->"ellande@ynov.com");
    }

    public static CompletableFuture<List> getPlayListAsync(String email){
        return CompletableFuture.supplyAsync(()-> List.of("Bob Marley", "Jay Z", "Megan"));
    }
    public static void show(){
        var future = CompletableFuture.supplyAsync(()->{
            LongTask.simulate();
            return 20;
        });
        try {
            var result = future
                    .completeOnTimeout(1, 1, TimeUnit.SECONDS)
                    .get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
