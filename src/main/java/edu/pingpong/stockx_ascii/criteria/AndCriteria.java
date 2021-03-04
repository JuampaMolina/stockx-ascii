package edu.pingpong.stockx_ascii.criteria;

import edu.pingpong.stockx_ascii.item.Item;
import edu.pingpong.stockx_ascii.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements Criteria{
    private Criteria firstCriteria;
    private Criteria secondCriteria;

    public AndCriteria(Criteria firstCriteria, Criteria secondCriteria) {
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

        List<Offer> firstCriteriaItems = getFirstCriteria().checkCriteria(item);
        List<Offer> secondCriteriaItems = getSecondCriteria().checkCriteria(item);

        return firstCriteriaItems.stream()
                                .filter(offer -> secondCriteriaItems.contains(offer))
                                .collect(Collectors.toList());
    }
}
