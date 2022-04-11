package com.design_pattern.demo.strategyDesignPattern.five;

import com.design_pattern.demo.strategyDesignPattern.four.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author sandu
 * @Date 2022-04-11 21:49
 */
public class SortAlgFactory {
    private static final Map<String , ISortAlg> algs = new HashMap<>();

    static {
        algs.put("QuickSort",new QuickSort());
        algs.put("ExternalSort",new ExternalSort());
        algs.put("ConcurrentExternalSort",new ConcurrentExternalSort());
        algs.put("MapReduceSort",new MapReduceSort());
    }

    public static ISortAlg getSortAlg(String type){
        if (type == null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return algs.get(type);
    }
}
