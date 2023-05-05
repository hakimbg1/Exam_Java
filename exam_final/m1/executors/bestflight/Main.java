package m1.executors.bestflight;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var flightService = new FlightService();
        flightService.getQuotes(List.of("site1", "site2", "site3", "site4"));

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
