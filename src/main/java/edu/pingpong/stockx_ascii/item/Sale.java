package edu.pingpong.stockx_ascii.item;

public class Sale implements Offer{
    private String size;
    private Integer price;

    public Sale(String size, Integer price) {
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return size;
    }

    @Override
    public int value() {
        return price;
    }

    @Override
    public int compareTo(Offer sale) {
        return this.price.compareTo(sale.value());
    }

    @Override
    public String toString() {
        return "\t\t" + size() + '\t' + value() + '\n';
    }
}
