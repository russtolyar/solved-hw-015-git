package com.solved.restaurant.department;

import com.solved.restaurant.Employee;

import java.util.List;

public class Kitchen {

    private List<Employee> Employees;
    private List<Staff> staff;

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
