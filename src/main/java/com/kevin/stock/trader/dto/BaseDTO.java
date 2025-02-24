package com.kevin.stock.trader.dto;

abstract class BaseDTO {
    private String symbol;
    private double bidQty;
    private double bidPrice;

    private double askQty;
    private double askPrice;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String sysmbol) {
        this.symbol = sysmbol;
    }

    public double getBidQty() {
        return bidQty;
    }

    public void setBidQty(double bidQty) {
        this.bidQty = bidQty;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getAskQty() {
        return askQty;
    }

    public void setAskQty(double askQty) {
        this.askQty = askQty;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }
}
