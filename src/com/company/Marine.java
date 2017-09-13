package com.company;

public class Marine extends FootSoldier implements Navy {

    protected void speak(){
        System.out.println("Hoohrah");
    }

    @Override
    public void navyParty() {
        System.out.println("WooHoohrah");
    }

    @Override
    public void navyTipsy() {
        System.out.println("Wobble Wobble");
    }

    @Override
    public void navyBasicTraining() {
        System.out.println("Stay thirsty my friends.");
    }

}