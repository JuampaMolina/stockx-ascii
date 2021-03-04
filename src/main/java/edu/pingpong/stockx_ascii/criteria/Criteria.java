package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item);
}
