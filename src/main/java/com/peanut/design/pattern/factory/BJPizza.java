package com.peanut.design.pattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BJPizza extends Pizza {
    @Override
    void prepare() {
        log.info("Prepare BJPizza");
    }

    @Override
    void make() {
        log.info("make BJPizza");
    }

    @Override
    void pack() {
        log.info("make BJPizza");
    }
}
