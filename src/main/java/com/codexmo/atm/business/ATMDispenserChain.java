package com.codexmo.atm.business;

public class ATMDispenserChain {

    public DispenseChain getATMDispenserChain() {
        DispenseChain dispense5000 = new Rupee5000Dispenser();
        DispenseChain dispense1000 = new Rupee1000Dispenser();
        DispenseChain dispense500 = new Rupee500Dispenser();
        DispenseChain dispense100 = new Rupee100Dispenser();

        dispense5000.setNextChain(dispense1000);
        dispense1000.setNextChain(dispense500);
        dispense500.setNextChain(dispense100);
        return dispense5000;
    }


}
