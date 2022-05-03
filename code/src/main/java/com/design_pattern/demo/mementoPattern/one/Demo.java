package com.design_pattern.demo.mementoPattern.one;

import java.util.Scanner;

/**
 * @Author sandu
 * @Date 2022-05-03 14:33
 */
public class Demo {
    public static void main(String[] args) {
        InputText     inputText       = new InputText();
        SnapshotHolder snapshotsHolder = new SnapshotHolder();
        Scanner        scanner         = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals(":list")) {
                System.out.println(inputText.getText());
            } else if (input.equals(":undo")) {
                InputText snapshot = snapshotsHolder.popSnapshot();
                inputText.setText(snapshot.getText());
            } else {
                snapshotsHolder.pushSnapshot(inputText);
                inputText.append(input);
            }
        }
    }
}
