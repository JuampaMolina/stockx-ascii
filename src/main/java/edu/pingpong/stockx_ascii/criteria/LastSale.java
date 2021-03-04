package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;
import edu.pingpong.stockx_ascii.item.Sale;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria{
    List<Offer> lastSale = new ArrayList<>();

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> sales = item.offers().stream().filter(offer -> offer instanceof Sale).collect(Collectors.toList());
        lastSale.add(sales.get(sales.size()-1));
        return lastSale;
    }
}
