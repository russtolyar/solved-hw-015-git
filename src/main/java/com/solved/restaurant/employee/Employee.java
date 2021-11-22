package com.solved.restaurant.employee;


import com.solved.restaurant.Human;

import java.time.LocalDateTime;

public class Employee extends Human {

    private String department;
    private int experience;
    private String position;

    public Employee(String name, String lastName, LocalDateTime dob, boolean isMarried, String department, int experience, String position) {
        super(name, lastName, dob, isMarried);
        this.department = department;
        this.experience = experience;
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
