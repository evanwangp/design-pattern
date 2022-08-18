package com.peanut.design.pattern.factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SYPizza extends Pizza {
    @Override
    public void prepare() {
        log.info("Prepare SYPizza");
    }

    @Override
    public void make() {
        log.info("make SYPizza");
    }

    @Override
    public void pack() {
        log.info("make SYPizza");
    }
}
