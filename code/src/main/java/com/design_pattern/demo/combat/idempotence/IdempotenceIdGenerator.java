package com.design_pattern.demo.combat.idempotence;

import java.util.UUID;

/**
 * 幂等号生成类
 *
 * @Author sandu
 * @Date 2022-06-04 15:24
 */
public class IdempotenceIdGenerator {
    public String generateId(){
        return UUID.randomUUID().toString();
    }
}
