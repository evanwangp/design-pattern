package com.peanut.design.pattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BSDPizza extends Pizza {
    @Override
    void prepare() {
        log.info("Prepare BSDPizza");
    }

    @Override
    void make() {
        log.info("make BSDPizza");
    }

    @Override
    void pack() {
        log.info("make BSDPizza");
    }
}
