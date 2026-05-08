package edu.teamrocket.criteria;

import edu.teamrocket.offer.Offer;
import edu.teamrocket.item.Item;
import java.util.List;

public interface Criteria {

public List<Offer> checkCriteria(Item item);
    
}