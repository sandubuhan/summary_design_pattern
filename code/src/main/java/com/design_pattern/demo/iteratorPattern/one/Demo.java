package com.design_pattern.demo.iteratorPattern.one;


import java.util.ArrayList;
import java.util.Iterator;


/**
 * @Author sandu
 * @Date 2022-05-03 9:54
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("xzg");
        names.add("wang");
        names.add("zheng");

        ArrayIterator<String> iterator = new ArrayIterator<String>();
        while (iterator.hasNext()) {
            System.out.println((iterator.currentItem()));
            iterator.next();
        }
    }
}
