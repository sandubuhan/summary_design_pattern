package com.design_pattern.demo.combat.idempotence;

/**
 * 用来读写幂
 *
 * @Author sandu
 * @Date 2022-06-04 15:26
 */
public interface IdempotenceStorage {
    boolean saveIfAbsent(String idempotenceId);

    void delete(String idempotenceId);
}
