package com.design_pattern.demo.statePattern.four;

import com.design_pattern.demo.statePattern.State;
import com.design_pattern.demo.statePattern.three.CapeMario;
import com.design_pattern.demo.statePattern.three.SuperMario;

/**
 * @Author sandu
 * @Date 2022-05-02 11:46
 */

public interface IMario {
    State getName();
    void obtainMushRoom(MarioStateMachine stateMachine);
    void obtainCape(MarioStateMachine stateMachine);
    void obtainFireFlower(MarioStateMachine stateMachine);
    void meetMonster(MarioStateMachine stateMachine);
}

