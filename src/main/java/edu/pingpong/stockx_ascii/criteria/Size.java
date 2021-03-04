package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Size implements Criteria{
    private String size;

    public Size (String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer.size().equals(size)).collect(Collectors.toList());
    }
}