package com.peanut.design.pattern.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NYPizza extends Pizza {
    @Override
    void prepare() {
        log.info("Prepare NYPizza");
    }

    @Override
    void make() {
        log.info("make NYPizza");
    }

    @Override
    void pack() {
        log.info("make NYPizza");
    }
}
