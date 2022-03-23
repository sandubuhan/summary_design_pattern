package com.design_pattern.demo.bridgePattern.alertBridge;

import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-23 22:27
 */
public class TelephoneMsgSender implements MsgSender{
    private List<String> telephones;

    public TelephoneMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        //...
    }
}
