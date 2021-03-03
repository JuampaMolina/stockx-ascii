package edu.pingpong.stockx_ascii.item;

public class Ask implements Offer{
    private String size;
    private Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int value() {
        return ask;
    }

    @Override
    public int compareTo(Offer ask) {
        return this.ask.compareTo(ask.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size() + '\t' + value() + '\n';
    }
}
