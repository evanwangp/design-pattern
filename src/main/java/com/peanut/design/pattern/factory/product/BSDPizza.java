package com.peanut.design.pattern.factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BSDPizza extends Pizza {
    @Override
    public void prepare() {
        log.info("Prepare BSDPizza");
    }

    @Override
    public void make() {
        log.info("make BSDPizza");
    }

    @Override
    public void pack() {
        log.info("make BSDPizza");
    }
}
