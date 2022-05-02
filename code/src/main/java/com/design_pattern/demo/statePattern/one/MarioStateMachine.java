package com.design_pattern.demo.statePattern.one;

import com.design_pattern.demo.statePattern.State;

/**
 * @Author sandu
 * @Date 2022-05-02 10:11
 */
public class MarioStateMachine {
    private int score;
    private State currentState;


    public MarioStateMachine(int score, State currentState) {
        this.score = score;
        this.currentState = currentState;
    }

    public void obtainMushRoom(){

    }

    public void obtainCape(){

    }

    public void obtainFireFlower(){

    }

    public void meetMonster(){

    }

    public int getScore() {
        return score;
    }

    public State getCurrentState(){
        return this.currentState;
    }
}
