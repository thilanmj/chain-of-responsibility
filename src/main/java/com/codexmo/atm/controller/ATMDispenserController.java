package com.codexmo.atm.controller;

import com.codexmo.atm.business.ATMDispenserChain;
import com.codexmo.atm.business.DispenseChain;
import com.codexmo.atm.model.Currency;

public class ATMDispenserController {

    public void withdrawMoney(int amount) {
        ATMDispenserChain atmDispenserChain = new ATMDispenserChain();
        DispenseChain dispenser = atmDispenserChain.getATMDispenserChain();
        if ( amount % 100 != 0 ) {
            System.out.println("Amount should be ");
            return;
        }
        dispenser.dispense(new Currency(amount));

    }

}
