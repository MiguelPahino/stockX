package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;
import edu.teamrocket.offer.Sale;

public class Sales implements Criteria {

    public Sales(){};

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(x -> x instanceof Sale).toList();
    }
    
}
