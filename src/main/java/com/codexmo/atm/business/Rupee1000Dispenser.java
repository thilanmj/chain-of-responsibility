package com.codexmo.atm.business;

import com.codexmo.atm.model.Currency;

public class Rupee1000Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if ( currency.getAmount() >= 1000 ) {
            int num = currency.getAmount() / 1000;
            int remainder = currency.getAmount() % 1000;
            System.out.println("Dispensing " + num + " Rs1000 note.");
            if ( remainder != 0 ) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

}
