package com.codexmo.atm.business;

import com.codexmo.atm.model.Currency;

public class Rupee100Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if ( currency.getAmount() >= 100 ) {
            int num = currency.getAmount() / 100;
            int remainder = currency.getAmount() % 100;
            System.out.println("Dispensing " + num + " Rs100 note.");
            if ( remainder != 0 ) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

}
