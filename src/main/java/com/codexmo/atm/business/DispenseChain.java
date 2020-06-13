package com.codexmo.atm.business;

import com.codexmo.atm.model.Currency;

public interface DispenseChain {

    void setNextChain(DispenseChain nextDispenseChain);

    void dispense(Currency currency);

}
