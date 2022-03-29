package com.design_pattern.demo.adapterPattern.compositePattern.company;

/**
 * @Author sandu
 * @Date 2022-03-29 22:20
 */
public class Employee extends HumanResource {
    public Employee(long id, double salary) {
        super(id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}