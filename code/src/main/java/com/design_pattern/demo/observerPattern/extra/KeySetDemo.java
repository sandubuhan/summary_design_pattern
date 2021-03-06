package com.design_pattern.demo.observerPattern.extra;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author sandu
 * @Date 2022-04-05 10:51
 */
public class KeySetDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("01", "qwe");
        map.put("02", "asd");
        map.put("03", "zxc");
        // 先获取map集合的所有键的set集合，即为map中所有key值得集合
        Set<String> keySet = map.keySet();
        // 有了set集合，就可以获取其迭代器
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            // 有了键可以通过map集合的get方法获取其对应的值
            String value = map.get(key);
            // 获得key和value值
            System.out.println("key:" + key + "-->value:" + value);
        }
    }
}

