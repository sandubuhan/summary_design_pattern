package com.design_pattern.demo.iteratorPattern.one;

import java.util.Iterator;

/**
 * @Author sandu
 * @Date 2022-05-03 9:58
 */
public class ArrayList implements List{
    private ArrayList arrayList;

    @Override
    public ArrayIterator iterator() {
        return new ArrayIterator(arrayList);
    }

    public ArrayList() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public int size() {
        return 0;
    }

    public <E> E get(int cursor) {
        return null;
    }
}

