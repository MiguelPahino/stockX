package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;

public class Size implements Criteria{

    private String size = new String();

    public Size(String size){
        this.size = size;
    };

    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers().stream().filter(x -> x.size() == this.size).toList();
    }
    
}
