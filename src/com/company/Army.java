package com.company;

public class Army extends FootSoldier implements InterfaceStore, Bomb {

    protected void speak() {
        System.out.println("Hooah");
    }


    @Override
    public void danceParty() {
        System.out.println("Get down!");
    }

    @Override
    public void getTipsy() {
        System.out.println("Slurrr");
    }

    @Override
    public void basicTraining() {
        System.out.println("Time to learn");
    }

    @Override
    public void bomb() {
        System.out.println("Time to go boom!!!");
    }
}