package com.solved.restaurant.department;

import com.solved.restaurant.employee.Employee;

import java.util.List;

public class DepKitchen {

    private List<Employee> kitEmployees;

    public List<Employee> getKitEmployees() {
        return kitEmployees;
    }

    public void setKitEmployees(List<Employee> kitEmployees) {
        this.kitEmployees = kitEmployees;
    }
}
