package com.peanut.design.pattern.factory;

public abstract class PizzaStore {

    public void orderPizza(String item) {
        Pizza pizza = createPizza(item);
        pizza.prepare();
        pizza.make();
        pizza.pack();
    }
    abstract Pizza createPizza(String item);

}
