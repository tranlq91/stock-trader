package com.kevin.stock.trader.controller;

import com.kevin.stock.trader.entity.Wallets;
import com.kevin.stock.trader.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/wallets")
public class WalletController {
    @Autowired
    private WalletService walletService;

    @GetMapping
    public List<Wallets> getAllWallets() {
        return walletService.getAllWallets();
    }

    @PostMapping
    public void addWallets(@RequestBody Wallets wallets) {
        walletService.createNewWallet(wallets);
    }
}
