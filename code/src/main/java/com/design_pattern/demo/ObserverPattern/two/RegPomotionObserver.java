package com.design_pattern.demo.ObserverPattern.two;

/**
 * @Author sandu
 * @Date 2022-04-04 17:08
 */
public class RegPomotionObserver implements RegObserver{
    private PromotionService promotionService;

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
        System.out.println("BeiJing");
    }
}
