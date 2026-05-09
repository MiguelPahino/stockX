package edu.teamrocket.offer;

public class Bid implements Offer {
    
    private String size = new String();
    private Integer bid = 0;

    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer oferta) {
        return Integer.compare(this.bid, oferta.value());
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Bid\n Size: ");
        build.append(size());
        build.append("\nBid: ");
        build.append(value());
        return build.toString();        
    }
}

