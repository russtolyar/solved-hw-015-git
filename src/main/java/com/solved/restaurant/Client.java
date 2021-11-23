package com.solved.restaurant;

import com.solved.restaurant.menu.Drink;
import com.solved.restaurant.menu.Food;
import com.solved.restaurant.menu.Menu;


import java.time.LocalDateTime;
import java.util.List;


public class Client {

    private String name;
    private LocalDateTime dob;
    private boolean inRestaurant;
    private Address address;
    private List<Drink> drinks;
    private List<Food> dishes;

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Food> getDishes() {
        return dishes;
    }

    public void setDishes(List<Food> dishes) {
        this.dishes = dishes;
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
