package edu.teamrocket.offer;

public class Ask implements Offer{
    private String size = new String();
    private Integer ask = 0;

    public Ask(String size, Integer ask){
        this.size = size;
        this.ask = ask;
    }

     @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public int compareTo(Offer oferta) {
        return Integer.compare(this.ask, oferta.value());
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
