package edu.teamrocket.offer;

public class Sale implements Offer{
    private String size = new String();
    private Integer price = 0;

    public Sale(String size, Integer price){
        this.size = size;
        this.price = price;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.price;
    }

    @Override
    public int compareTo(Offer oferta) {
        return Integer.compare(this.price, oferta.value());
    }

    @Override
    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("Bid\n Size: ");
        build.append(size());
        build.append("\nAsk: ");
        build.append(value());
        return build.toString();        
    }
}
