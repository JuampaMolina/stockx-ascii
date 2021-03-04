package edu.pingpong.stockx_ascii.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item{

    private String style;
    private String name;
    private int sale;
    private int ask;
    private int bid;
    private List<Offer> offers = new ArrayList<>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getBid() {
        return bid;
    }

    @Override
    public int getAsk() {
        return ask;
    }

    @Override
    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    @Override
    public void add(Offer offer) {
        offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return offers;
    }

    @Override
    public String toString() {
        return getName() + '\n' + "\t\t" +
                getStyle();
    }
}
