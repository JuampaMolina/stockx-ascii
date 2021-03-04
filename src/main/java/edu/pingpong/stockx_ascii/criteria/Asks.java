package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Ask;
import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(offer -> offer instanceof Ask).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
