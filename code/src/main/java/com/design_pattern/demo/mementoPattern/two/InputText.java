package com.design_pattern.demo.mementoPattern.two;

/**
 * 发起人：通过新建一个备忘录对象来保存自己的内部状态
 *
 * @Author sandu
 * @Date 2022-05-03 15:02
 */
public class InputText {
    private StringBuilder text = new StringBuilder();

    public String getText() {
        return text.toString();
    }

    public void append(String input) {
        text.append(input);
    }

    public Snapshot createSnapshot() {
        return new Snapshot(text.toString());
    }

    public void restoreSnapshot(Snapshot snapshot) {
        this.text.replace(0, this.text.length(), snapshot.getText());
    }
}

