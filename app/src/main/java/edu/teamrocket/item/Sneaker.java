package edu.teamrocket.item;

import java.util.ArrayList;
import java.util.List;
import edu.teamrocket.offer.*;

public class Sneaker implements Item{
    
    private String style = new String();
    private String name = new String();
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> ofertas = new ArrayList<>();
    
    public Sneaker(String style,String name){
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getSale() {
        return sale;
    }

    public int getAsk() {
        return ask;
    }

    public int getBid() {
        return bid;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public void setAsk(int ask) {
        this.ask = ask;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void add(Offer oferta){
        this.ofertas.add(oferta);
    }

    public List<Offer> offers(){
        return this.ofertas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append(getName());
        builder.append("\n");
        builder.append(getStyle());
        builder.append("\n");

        return builder.toString();
    }


    
}
