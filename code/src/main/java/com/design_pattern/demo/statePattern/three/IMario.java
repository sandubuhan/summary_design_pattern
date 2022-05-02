package com.design_pattern.demo.statePattern.three;

import com.design_pattern.demo.statePattern.State;

/**
 * @Author sandu
 * @Date 2022-05-02 10:55
 */
public interface IMario {

    State getName();

    /**
     * 以下是定义的事件
     */
    void obtainMushRoom();

    void obtainCape();

    void obtainFireFlower();

    void meetMonster();
}
