package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Bid;
import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item item) {

        Optional<Offer> maxBid = item.offers()
                                    .stream()
                                    .filter(offer -> offer instanceof Bid)
                                    .max(Offer::compareTo);

        return maxBid.isPresent()? List.of(maxBid.get()) : List.of();
    }
}

