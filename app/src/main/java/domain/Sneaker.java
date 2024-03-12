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

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    @Override
    public Integer getBid() {
        return bid;
    }

    @Override
    public Integer getAsk() {
        return ask;
    }

    @Override
    public Integer getSale() {
        return sale;
    }

    @Override
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public void setAsk(Integer ask) {
        this.ask = ask;
    }

    @Override
    public void setSale(Integer sale) {
        this.sale = sale;
    }

    @Override
    public void add(Offer offer) {

    }

    @Override
    public List<Offer> offers() {
        return null;
    }

    @Override
    public String toString() {
        return
                "\n\n\t\t" + this.getAsk() + " Buy\t"
                        + this.getBid() + " Sell \n" +

                        "\t\t" + " _    _" + "\n" +
                        "\t\t" + "(_\\__/(,_" + "\n" +
                        "\t\t" + "| \\ `_////-._" + "\n" +
                        "\t\t" + "J_/___\"=> __/`\\" + "\n" +
                        "\t\t" + "|=====;__/___./" + "\n" +
                        "\t\t" + "\'-\'-\'-\"\"\"\"\"\"\"`" + "\n" +

                        "\t"  + "\n" +
                        "\t\tlast sale: " + this.getSale();
    }
}
