package com.design_pattern.demo.adapterPattern.compositePattern.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-29 22:19
 */

public abstract class HumanResource {
    protected long id;
    protected double salary;

    public HumanResource(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public abstract double calculateSalary();
}


