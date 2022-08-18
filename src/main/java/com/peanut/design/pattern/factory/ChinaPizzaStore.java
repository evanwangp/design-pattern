package com.peanut.design.pattern.factory;

public class ChinaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if("BJ".equals(item)) {
            return new BJPizza();
        } else {
            return new SYPizza();
        }
    }
}
