package com.design_pattern.demo.ObserverPattern.one;

import lombok.Data;

/**
 * @Author sandu
 * @Date 2022-04-04 16:51
 */
@Data
public class Message {

    private String title;
    private Integer wordCount;

    public Message(String title, Integer wordCount) {
        this.title = title;
        this.wordCount = wordCount;
    }

    public Message() {
    }
}
