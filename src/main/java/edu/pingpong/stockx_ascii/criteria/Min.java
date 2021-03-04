package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public Min(Criteria firstCriteria, Criteria secondCriteria) {
        this.firstCriteria = firstCriteria;
        this.secondCriteria = secondCriteria;
    }

    public Criteria getFirstCriteria() {
        return firstCriteria;
    }

    public Criteria getSecondCriteria() {
        return secondCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(getFirstCriteria(), getSecondCriteria());

        Optional<Offer> offer = andCriteria.checkCriteria(item)
                .stream()
                .min(Offer::compareTo);

        return offer.isPresent()? List.of(offer.get()) : List.of();
    }
}
