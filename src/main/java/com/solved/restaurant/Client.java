package com.solved.restaurant;

import com.solved.restaurant.menu.Menu;


import java.time.LocalDateTime;


public class Client {

    private Menu menu;
    private String name;
    private LocalDateTime dob;
    private boolean inRestaurant;
    private Address address;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public boolean isInRestaurant() {
        return inRestaurant;
    }

    public void setInRestaurant(boolean inRestaurant) {
        this.inRestaurant = inRestaurant;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
