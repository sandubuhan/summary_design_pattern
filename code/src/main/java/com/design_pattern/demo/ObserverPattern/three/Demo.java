package com.design_pattern.demo.ObserverPattern.three;

import com.design_pattern.demo.decoratorPattern.A;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-04-04 17:38
 */
public class Demo {
    public static void main(String[] args) {
        List<Aaaaaa> aaaaaaList = new ArrayList<>();
        for (Aaaaaa aaaaaa : aaaaaaList) {
            Integer asdasdq = aaaaaa.asdasdq(1);
            System.out.println(asdasdq);
        }
    }
}
