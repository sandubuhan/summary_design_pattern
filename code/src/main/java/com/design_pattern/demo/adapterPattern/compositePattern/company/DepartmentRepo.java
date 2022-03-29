package com.design_pattern.demo.adapterPattern.compositePattern.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author sandu
 * @Date 2022-03-29 22:21
 */
public class DepartmentRepo {
    public List<Long> getSubDepartmentIds(long id) {
        List<Long> list = new ArrayList();
        list.add(1L);
        list.add(2L);
        return list;
    }
}
