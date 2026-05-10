package edu.teamrocket.criteria;

import java.util.Comparator;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Bid;
import edu.teamrocket.offer.Offer;

public class MaxBid implements Criteria {
    
    public MaxBid(){};

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(x -> x instanceof Bid)
        .max(Comparator.comparingInt(Offer::value)).stream().toList();
    }
}
