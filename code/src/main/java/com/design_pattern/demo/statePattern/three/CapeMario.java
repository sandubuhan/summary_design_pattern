package com.design_pattern.demo.statePattern.three;

import com.design_pattern.demo.statePattern.State;

/**
 * @Author sandu
 * @Date 2022-05-02 11:17
 */
public class CapeMario implements IMario {


    private MarioStateMachine stateMachine;

    public CapeMario(MarioStateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }


    @Override
    public State getName() {
        return null;
    }

    @Override
    public void obtainMushRoom() {

    }

    @Override
    public void obtainCape() {

    }

    @Override
    public void obtainFireFlower() {

    }

    @Override
    public void meetMonster() {

    }
}
