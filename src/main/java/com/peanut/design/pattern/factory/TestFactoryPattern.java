package com.peanut.design.pattern.factory;

import com.peanut.design.pattern.factory.store.AmericanPizzaStore;
import com.peanut.design.pattern.factory.store.ChinaPizzaStore;
import com.peanut.design.pattern.factory.store.PizzaStore;

import java.util.Scanner;

public class TestFactoryPattern {
    public static void main(String[] args) {
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            int num = input.nextInt();
            String item = generateItem(num);
            PizzaStore pizzaStore;
            if (num == 1 || num == 2) {
                pizzaStore = new ChinaPizzaStore();
            } else {
                pizzaStore = new AmericanPizzaStore();
            }
            pizzaStore.orderPizza(item);
        } while (true);
    }

    private static String generateItem(int num) {

        String item = "BJ";
        if(num == 1) {
            item = "BJ";
        } else if(num == 2) {
            item = "SY";
        } else if(num == 3) {
            item = "NY";
        } else {
            item = "BSD";
        }
        return item;
    }

}
