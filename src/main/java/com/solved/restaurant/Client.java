package com.solved.restaurant;

import com.solved.restaurant.menu.MenuToDrink;
import com.solved.restaurant.menu.MenuToEat;

import java.time.LocalDateTime;


public class Client extends Human{

    private MenuToDrink drink;
    private MenuToEat food;
    private boolean inRestaurant;


    public Client(String name, String lastName, LocalDateTime dob, boolean isMarried, MenuToDrink drink, MenuToEat food, boolean inRestaurant) {
        super(name, lastName, dob, isMarried);
        this.drink = drink;
        this.food = food;
        this.inRestaurant = inRestaurant;
    }

    public MenuToDrink getDrink() {
        return drink;
    }

    public void setDrink(MenuToDrink drink) {
        this.drink = drink;
    }

    public MenuToEat getFood() {
        return food;
    }

    public void setFood(MenuToEat food) {
        this.food = food;
    }

    public boolean isInRestaurant() {
        return inRestaurant;
    }

    public void setInRestaurant(boolean inRestaurant) {
        this.inRestaurant = inRestaurant;
    }
}
