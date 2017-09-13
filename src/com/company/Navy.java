package com.company;

public interface Navy {
    void navyParty();

    void navyTipsy();

    void navyBasicTraining();

    default void warSounds(){
        System.out.println("pew pew pew\n");
    }
}
