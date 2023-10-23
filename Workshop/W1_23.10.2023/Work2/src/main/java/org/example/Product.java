package org.example;

public class Product {

    private String name;
    private double unitPrice;
    private double discount;
    private String imagerUrl;
    private int unitsInStocks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getImagerUrl() {
        return imagerUrl;
    }

    public void setImagerUrl(String imagerUrl) {
        this.imagerUrl = imagerUrl;
    }

    public int getUnitsInStocks() {
        return unitsInStocks;
    }

    public void setUnitsInStocks(int unitsInStocks) {
        this.unitsInStocks = unitsInStocks;
    }
}
