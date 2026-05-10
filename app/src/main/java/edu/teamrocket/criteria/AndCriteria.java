package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;
import java.util.Optional;

public class AndCriteria implements Criteria {
    
    private  Optional<Criteria> criteria = Optional.empty() ;
    private Optional<Criteria> otherCriteria = Optional.empty();

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = Optional.of(criteria);
        this.otherCriteria = Optional.of(otherCriteria);
    };

    @Override
    public List<Offer> checkCriteria(Item item) {
        return criteria.get().checkCriteria(item).stream()
        .filter(x -> otherCriteria.get().checkCriteria(item).contains(x))
        .toList();
    }

}