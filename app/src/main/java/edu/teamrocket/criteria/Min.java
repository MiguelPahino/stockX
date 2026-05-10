package edu.teamrocket.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;

public class Min implements Criteria{
    private  Optional<Criteria> criteria = Optional.empty() ;
    private Optional<Criteria> otherCriteria = Optional.empty();

    public Min(Criteria criteria, Criteria otherCriteria){
        this.criteria = Optional.of(criteria);
        this.otherCriteria = Optional.of(otherCriteria);
    };

    @Override
    public List<Offer> checkCriteria(Item item) {
        return criteria.get().checkCriteria(item).stream()
        .filter(x -> otherCriteria.get().checkCriteria(item).contains(x))
        .min(Comparator.comparingInt(Offer::value))
        .stream().toList();
    }

}
