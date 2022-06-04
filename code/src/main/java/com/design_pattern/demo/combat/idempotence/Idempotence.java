package com.design_pattern.demo.combat.idempotence;

/**
 * 幂等号存储管理类
 *
 * @Author sandu
 * @Date 2022-06-04 15:21
 */
public class Idempotence {
    private IdempotenceStorage storage;

    public Idempotence(IdempotenceStorage storage){
        this.storage = storage;
    }

    public boolean saveIfAbsent(String idempotenceId){
        return storage.saveIfAbsent(idempotenceId);
    }

    public void delete(String idempotenceId){
        storage.delete(idempotenceId);
    }
}
