package com.solved.restaurant.menu;


import java.util.List;

public class Menu {

    private String type;
    private List<Drink> drinks;
    private List<Food> dishes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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
}
