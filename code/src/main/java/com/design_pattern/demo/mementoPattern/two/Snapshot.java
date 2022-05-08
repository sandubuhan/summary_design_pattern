package com.design_pattern.demo.mementoPattern.two;

/**
 * 备忘录管理者：负责保存备忘录对象
 *
 * @Author sandu
 * @Date 2022-05-03 15:02
 */
public class Snapshot {

    
    private String text;

    public Snapshot(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }


}