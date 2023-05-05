package m1.executors.bestflight;

public class Quote {
    private String site;
    private int price;

    public Quote(String site, int price) {
        this.site = site;
        this.price = price;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "site='" + site + '\'' +
                ", price=" + price +
                '}';
    }
}
