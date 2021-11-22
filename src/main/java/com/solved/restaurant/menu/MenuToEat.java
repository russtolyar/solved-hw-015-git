package com.solved.restaurant.menu;

import java.util.List;

public class MenuToEat {

    private String type;  //meat, fish, vegan
    private List<Food> dishes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Food> getDishes() {
        return dishes;
    }

    public void setDishes(List<Food> dishes) {
        this.dishes = dishes;
    }
}
