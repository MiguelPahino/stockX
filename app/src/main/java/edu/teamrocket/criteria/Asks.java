package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Ask;
import edu.teamrocket.offer.Offer;

public class Asks implements Criteria{

    public Asks(){};

  
    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(x -> x instanceof Ask).toList();
    }

}

