package com.design_pattern.demo.mementoPattern.two;

import java.util.Stack;

/**
 * 备忘录：将发起人传过来的对象保存起来
 *
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