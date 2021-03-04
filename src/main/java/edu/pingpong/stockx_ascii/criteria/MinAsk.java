package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Ask;
import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;
import java.util.Optional;

public class MinAsk implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {

        Optional<Offer> minAsk = item.offers()
                                    .stream()
                                    .filter(offer -> offer instanceof Ask)
                                    .min(Offer::compareTo);

        return minAsk.isPresent()? List.of(minAsk.get()) : List.of();
    }
}
