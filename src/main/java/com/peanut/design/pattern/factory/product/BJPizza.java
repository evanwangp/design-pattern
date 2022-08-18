package com.peanut.design.pattern.factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BJPizza extends Pizza {
    @Override
    public void prepare() {
        log.info("Prepare BJPizza");
    }

    @Override
    public void make() {
        log.info("make BJPizza");
    }

    @Override
    public void pack() {
        log.info("make BJPizza");
    }
}
