package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Bid;
import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer instanceof Bid).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}