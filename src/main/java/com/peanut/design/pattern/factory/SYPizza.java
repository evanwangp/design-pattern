package com.peanut.design.pattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SYPizza extends Pizza {
    @Override
    void prepare() {
        log.info("Prepare SYPizza");
    }

    @Override
    void make() {
        log.info("make SYPizza");
    }

    @Override
    void pack() {
        log.info("make SYPizza");
    }
}
