package com.design_pattern.demo.ObserverPattern.extra;

import java.util.*;

/**
 * entrySet 返回映射所包含的映射关系的SET集合（一个关系就是一个键值对），就是把keyvalue作为一个整体一堆一堆的存放到set集合当中
 * @Author sandu
 * @Date 2022-04-05 10:52
 */
public class EntrySetDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("01", 1);
        map.put("02", 2);
        map.put("03", 3);

        // 此方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String                     key  = next.getKey();
            Integer                    value = next.getValue();
            System.out.println("key:" + key + "-->value:" + value);
        }
    }
}
