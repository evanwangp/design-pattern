package com.peanut.design.pattern.factory.store;

import com.peanut.design.pattern.factory.product.BJPizza;
import com.peanut.design.pattern.factory.product.Pizza;
import com.peanut.design.pattern.factory.product.SYPizza;

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
