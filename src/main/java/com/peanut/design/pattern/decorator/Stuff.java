package com.peanut.design.pattern.decorator;

/**
 * 装饰者
 */
public class Stuff extends Coffee {

    private Coffee coffee;

    public Stuff(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public float cost() {
        return super.getPrice() + coffee.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + coffee.getDescription();
    }
}
