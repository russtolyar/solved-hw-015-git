package com.solved.restaurant.department;

import com.solved.restaurant.Employee;

import java.util.List;

public class Kitchen {

    private List<Employee> employees;
    private List<Staff> staff;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.employees = employees;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
