package com.peanut.design.pattern.decorator;

public class Milk extends Stuff {
    public Milk(Coffee coffee) {
        super(coffee);
        super.setDescription("牛奶");
        super.setPrice(0.25f);
    }

}
