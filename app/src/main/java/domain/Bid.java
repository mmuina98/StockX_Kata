package domain;

public class Bid implements Offer{
    private String size;
    private Integer bid;

    public Bid(String size, Integer bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return null;
    }

    @Override
    public Integer value(){
       return null;
    }

    @Override
    public Integer compareTo(Offer offer) {
        return null;
    }

    public String toString(){
        return "\t"+this.size()+"\t\t"+this.value();
    }

}
