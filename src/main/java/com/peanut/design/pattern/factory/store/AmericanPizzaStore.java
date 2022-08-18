package com.peanut.design.pattern.factory.store;

import com.peanut.design.pattern.factory.product.BSDPizza;
import com.peanut.design.pattern.factory.product.NYPizza;
import com.peanut.design.pattern.factory.product.Pizza;

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
