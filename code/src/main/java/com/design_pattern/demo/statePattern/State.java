package com.design_pattern.demo.statePattern;

/**
 * @Author sandu
 * @Date 2022-05-02 10:09
 */
public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3);

    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
