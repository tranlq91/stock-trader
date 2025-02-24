package com.kevin.stock.trader.repository;

import com.kevin.stock.trader.entity.Transactions;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Long> {
}