package com.peanut.design.pattern.factory.product;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NYPizza extends Pizza {
    @Override
    public void prepare() {
        log.info("Prepare NYPizza");
    }

    @Override
    public void make() {
        log.info("make NYPizza");
    }

    @Override
    public void pack() {
        log.info("make NYPizza");
    }
}
