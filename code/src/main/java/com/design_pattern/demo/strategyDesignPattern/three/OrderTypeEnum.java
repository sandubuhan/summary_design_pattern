package com.design_pattern.demo.strategyDesignPattern.three;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-04-06 21:26
 */
public enum OrderTypeEnum {
    NORMAL("正常",1),
    MIDDLE("中等",2),
    HIGH("紧急",3);

    private String type;

    private Integer typeId;

    OrderTypeEnum(String type, Integer typeId) {
        this.type = type;
        this.typeId = typeId;
    }

    static Map<Integer, OrderTypeEnum> enumMap = new HashMap<>();

    static {
        for (OrderTypeEnum type : OrderTypeEnum.values()) {
            if (enumMap.containsKey(type.getTaskTypeId())){
                try {
                    throw new Exception("");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            enumMap.put(type.getTaskTypeId(),type);
        }
    }

    public int getTaskTypeId(){
        return typeId;
    }

    public  static OrderTypeEnum getEnumById(Integer typeId){
        OrderTypeEnum typeEnum = enumMap.get(typeId);
        if (null == typeEnum){
            typeEnum = HIGH;
        }
        return typeEnum;
    }
}
