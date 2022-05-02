package com.design_pattern.demo.statePattern.two;

import com.design_pattern.demo.statePattern.State;
import com.design_pattern.demo.statePattern.three.IMario;

import static com.design_pattern.demo.statePattern.State.*;

/**
 * 查表法
 *
 * @Author sandu
 * @Date 2022-05-02 10:32
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    private static final int[][] actionTable = {
            {+100,+200,+300,+0},
            {+0,+200,300,-100},
            {+0,+0,+0,-200},
            {+0,+0,+0,-300}
    };

    private static final State[][] transitionTable = {
            {SUPER,CAPE,FIRE,SMALL},
            {SUPER,CAPE,FIRE,SMALL},
            {CAPE,CAPE,CAPE,SMALL},
            {FIRE,FIRE,FIRE,SMALL}
    };

    public void obtainMushRoom(){
        executeEvent(Event.GOT_CAPE);
    }

    private void executeEvent(Event event) {
        int stateValue = currentState.getValue();
        int eventValue = event.getValue();

        this.currentState = transitionTable[stateValue][eventValue];
        this.score += actionTable[stateValue][eventValue];
    }

    public int getScore(){
        return this.score;
    }
    public State getCurrentState(){
        return this.currentState;
    }



}
