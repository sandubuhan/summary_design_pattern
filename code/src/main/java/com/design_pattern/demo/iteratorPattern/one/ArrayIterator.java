package com.design_pattern.demo.iteratorPattern.one;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @Author sandu
 * @Date 2022-05-03 9:52
 */
public class ArrayIterator<E> implements Iterator<E> {
    private int cursor;
    private com.design_pattern.demo.iteratorPattern.one.ArrayList arrayList;

    public ArrayIterator(ArrayList arrayList) {
        this.cursor = 0;
        this.arrayList = arrayList;
    }

    public ArrayIterator() {

    }

    @Override
    public boolean hasNext() {
        return cursor != arrayList.size(); //注意这里，cursor在指向最后一个元素的时候，hasNext()仍旧返回true。
    }

    @Override
    public E next() {
        cursor++;
        return null;
    }


    public E currentItem() {
        if (cursor >= arrayList.size()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(cursor);
    }
}
