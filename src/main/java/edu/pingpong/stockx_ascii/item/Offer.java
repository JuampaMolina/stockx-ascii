package edu.pingpong.stockx_ascii.item;

public interface Offer {
    String size();
    int value();
    int compareTo(Offer offer);
}
