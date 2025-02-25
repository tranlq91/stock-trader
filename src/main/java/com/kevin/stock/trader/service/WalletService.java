package com.kevin.stock.trader.service;

import com.kevin.stock.trader.entity.Wallets;
import com.kevin.stock.trader.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WalletService {
    @Autowired
    private WalletRepository walletRepository;

    public List<Wallets> getAllWallets() {
        return walletRepository.findAll();
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void createNewWallet(Wallets wallets) {
        walletRepository.save(wallets);
    }
}
