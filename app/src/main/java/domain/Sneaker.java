package domain;

import java.util.List;

public class Sneaker implements Item{

    String style;
    String name;
    Integer sale = 0;
    Integer ask = 0;
    Integer bid = 0;

    public Sneaker(String style, String name) {

        this.style = style;
        this.name = name;

    }

    @Override
    public Integer getBid() {
        return null;
    }

    @Override
    public Integer getAsk() {
        return null;
    }

    @Override
    public Integer getSale() {
        return null;
    }

    @Override
    public void add(Offer offer) {

    }

    @Override
    public List<Offer> offers() {
        return null;
    }

    @Override
    public void setBid(Integer bid) {

    }

    @Override
    public void setAsk(Integer ask) {

    }

    @Override
    public void setSale(Integer sale) {

    }
}
