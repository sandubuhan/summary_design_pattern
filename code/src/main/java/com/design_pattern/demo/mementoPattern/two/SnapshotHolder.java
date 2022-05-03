package com.design_pattern.demo.mementoPattern.two;

import java.util.Stack;

/**
 * 备忘录管理者：负责保存备忘录对象
 * @Author sandu
 * @Date 2022-05-03 15:03
 */

public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}