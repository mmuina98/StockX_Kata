package domain;

public interface Offer {
    String size();

    Integer value();

    Integer compareTo(Offer offer);

}
