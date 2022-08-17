package com.peanut.design.pattern.decorator;

public class TestMain {
    public static void main(String[] args) {
        Coffee blackCoffee = new BlackCoffee();
        blackCoffee = new Milk(blackCoffee);
        blackCoffee = new Milk(blackCoffee);
        blackCoffee = new Milk(blackCoffee);
        System.out.println(blackCoffee.getDescription() + ":" + blackCoffee.cost());
    }
}
