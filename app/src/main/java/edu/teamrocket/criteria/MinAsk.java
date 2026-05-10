package edu.teamrocket.criteria;

import java.util.Comparator;
import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;
import edu.teamrocket.offer.Ask;

public class MinAsk implements Criteria{

    public MinAsk(){};

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream()
        .filter(x-> x instanceof Ask)
        .min(Comparator.comparingInt(Offer::value))
        .stream().toList();
    }
    
}
