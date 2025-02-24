package com.kevin.stock.trader.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String source;

    @Column
    private String symbol;

    @Column
    private double bidQty;

    @Column
    private double bidPrice;

    @Column
    private double askQty;

    @Column
    private double askPrice;

    @Column
    private double amount;

    public Transactions() {}

    public Transactions(String source, String symbol, double bidQty, double bidPrice, double askPrice, double askQty,
        double amount) {
        this.source = source;
        this.symbol = symbol;
        this.bidPrice = bidPrice;
        this.bidQty = bidQty;
        this.askPrice = askPrice;
        this.askQty = askPrice;
        this.setAmount(amount);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
