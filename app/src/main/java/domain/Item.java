package domain;


import java.util.List;

public interface Item {
    Integer getBid();

    Integer getAsk();

    Integer getSale();

    void add(Offer offer);

    List<Offer> offers();

    void setBid(Integer bid);

    void setAsk(Integer ask);

    void setSale(Integer sale);

}
