package com.peanut.design.pattern.decorator;

import lombok.Data;

@Data
public abstract class Coffee {

    private String description;
    private float price;

    /**
     * 计算费用
     * @return
     */
    public abstract float cost();

}
