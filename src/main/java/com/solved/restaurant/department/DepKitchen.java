package com.solved.restaurant.department;

import com.solved.restaurant.Employee;

import java.util.List;

public class DepKitchen {

    private List<Employee> kitEmployees;
    private List<Staff> staff;

    public List<Employee> getKitEmployees() {
        return kitEmployees;
    }

    public void setKitEmployees(List<Employee> kitEmployees) {
        this.kitEmployees = kitEmployees;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
