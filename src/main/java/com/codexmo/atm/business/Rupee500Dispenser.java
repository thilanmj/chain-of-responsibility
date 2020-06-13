package com.codexmo.atm.business;

import com.codexmo.atm.model.Currency;

public class Rupee500Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextDispenseChain) {
        this.chain = nextDispenseChain;
    }

    @Override
    public void dispense(Currency currency) {
        if ( currency.getAmount() >= 500 ) {
            int num = currency.getAmount() / 500;
            int remainder = currency.getAmount() % 500;
            System.out.println("Dispensing " + num + " Rs500 note.");
            if ( remainder != 0 ) {
                this.chain.dispense(new Currency(remainder));
            }
        } else {
            this.chain.dispense(currency);
        }
    }

}
