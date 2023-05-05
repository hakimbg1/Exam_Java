package m1.executors.bestflight;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class FlightService {
    public void getQuotes(List<String> sites){
        var start = LocalTime.now();

        sites.forEach(site->{
            System.out.println("Getting a quote from "+ site);
        });

        List<CompletableFuture<Quote>> futures = new ArrayList<>();

        sites.forEach(site-> {
            var future = CompletableFuture.supplyAsync(()->{
                var random = new Random();

                LongTask.simulate(1000 + random.nextInt(2000));

                var price = 100 + random.nextInt(10);

                var quote = new Quote(site, price);
                System.out.println(quote);

                return quote;
            });
            futures.add(future);
        });

        CompletableFuture
                .allOf(futures.toArray(new CompletableFuture[0]))
                .thenRun(()->{
                    var end = LocalTime.now();
                    var duration = Duration.between(start, end);
                    System.out.println("Retrieve all quotes in "+duration.toMillis()+ " msec");
                });
    }
}
