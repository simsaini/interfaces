package com.company;

public  abstract class FootSoldier {
    protected String name;
    protected String rank;
    protected String serial;

    protected void sleep(){
        System.out.println("Snore");
    }

    protected void eat(){
        System.out.println("chew");
    }

    protected void march(){
        System.out.println("Trudge");
    }

    protected abstract void speak();

}