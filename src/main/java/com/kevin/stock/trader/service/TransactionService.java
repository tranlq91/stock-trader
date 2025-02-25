package com.kevin.stock.trader.service;

import com.kevin.stock.trader.entity.Transactions;
import com.kevin.stock.trader.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Random;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    private final Random random = new Random();

    public List<Transactions> getAllTransactions() {
        return transactionRepository.findAll();
    }


    @Scheduled(fixedRate = 10000)  // Runs every 10 seconds
    public void fetchAndStoreBestPricing() {
        // Simulate fetching prices from different sources
        List<Double> prices = List.of(
                100.0 + random.nextDouble() * 10,  // Source A
                98.0 + random.nextDouble() * 5,   // Source B
                102.0 + random.nextDouble() * 8   // Source C
        );

        // Find the best (lowest) price
        Double bestPrice = prices.stream().min(Double::compareTo).orElseThrow();

        // Save to the database
        Transactions transactions = new Transactions();
        // TODO: add more
//        transactionRepository.save(transactions);

        System.out.println("Saved best price: " + bestPrice);
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void createNewTransactions(Transactions transactions) {
        transactionRepository.save(transactions);
    }
}
