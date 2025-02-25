package com.kevin.stock.trader.repository;

import com.kevin.stock.trader.entity.Wallets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WalletRepository extends JpaRepository<Wallets, Long> {
}
