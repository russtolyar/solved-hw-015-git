package com.solved.restaurant;

import java.time.LocalDateTime;

public class Human {
    private String name;
    private String lastName;
    private LocalDateTime dob;
    private boolean isMarried;

    public Human(String name, String lastName, LocalDateTime dob, boolean isMarried) {
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.isMarried = isMarried;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
