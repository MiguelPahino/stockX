package edu.teamrocket.item;

import edu.teamrocket.offer.Offer;
import java.util.List;

public interface Item {

    public int getBid();

    public int getAsk();

    public int getSale();

    public void add(Offer oferta);

    public List<Offer> offers();

    public void setBid(int bid);

    public void setAsk(int ask);

    public void setSale(int sale);
    
}