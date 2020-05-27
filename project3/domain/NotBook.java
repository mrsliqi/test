package project3.domain;

public class NotBook implements Equipment{
    private String modle;
    private double price;

    public NotBook() {
    }

    public NotBook(String modle, double price) {
        this.modle = modle;
        this.price = price;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return modle + "(" + price + ")";
    }

}
