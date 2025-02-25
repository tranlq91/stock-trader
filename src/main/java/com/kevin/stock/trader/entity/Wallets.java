package com.kevin.stock.trader.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "wallets")
public class Wallets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String currencies;

    @Column
    private double balance;
}
