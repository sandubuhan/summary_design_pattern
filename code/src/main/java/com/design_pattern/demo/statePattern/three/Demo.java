package com.design_pattern.demo.statePattern.three;

/**
 * @Author sandu
 * @Date 2022-05-02 14:49
 */
public class Demo {
    private static MarioStateMachine stateMachine;

    public static void main(String[] args) {
        MarioStateMachine marioStateMachine = new MarioStateMachine(0, new SmallMario(stateMachine));
        marioStateMachine.obtainMushRoom();
        System.out.println(marioStateMachine.getScore());
        System.out.println(marioStateMachine.getCurrentState());
    }
}
