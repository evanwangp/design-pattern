package com.peanut.design.pattern.factory;

public class AmericanPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if("NY".equals(item)) {
            return new NYPizza();
        } else {
            return new BSDPizza();
        }
    }
}
