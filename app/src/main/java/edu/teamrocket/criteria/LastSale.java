package edu.teamrocket.criteria;

import java.util.List;

import edu.teamrocket.item.Item;
import edu.teamrocket.offer.Offer;
import edu.teamrocket.offer.Sale;

public class LastSale implements Criteria {

    public LastSale(){};

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> listaSales =  item.offers().stream().filter(x -> x instanceof Sale).toList();


        return listaSales.stream()
        .filter(x -> x instanceof Sale)
        .skip(Math.max(0,listaSales.size() -1))
        .toList();
    }
    
}
