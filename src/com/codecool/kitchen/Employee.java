package com.codecool.kitchen;

import java.util.Date;

/**
 * Abstract superclass of all employees
 */
abstract class Employee {

    private String name;
    private Date birthdate;
    private double salary;

    /**
     * Set the name of the employee
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the name of the employee
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the birthdate of the employee
     * @param birthdate
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Get the birthdate of the employee
     * @return birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * Set the salary of the employee
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Get the salary of the employee
     * @return salary
     */
    private double getSalary() {
        return salary;
    }

    /**
     * Give the tax of the employee
     */
    public void taxReport() {
        System.out.println("Tax: " + getSalary() * 0.99);
    }
}
