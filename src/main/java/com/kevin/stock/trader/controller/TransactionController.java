package com.kevin.stock.trader.controller;

import com.kevin.stock.trader.entity.Transactions;
import com.kevin.stock.trader.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transactions> getAllTransactions() {
        return transactionService.getAllTransactions();
    }
}
