package com.peanut.design.pattern.decorator;

public class BlackCoffee extends Coffee {


    public BlackCoffee() {
        setDescription("黑咖啡");
        setPrice(1.2f);
    }

    @Override
    public float cost() {
        return super.getPrice();
    }
}
