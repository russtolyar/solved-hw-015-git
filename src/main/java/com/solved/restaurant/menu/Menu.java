package com.solved.restaurant.menu;

import java.util.List;

public class Menu {

    private List<MenuToDrink> menuToDrinkList;
    private List<MenuToEat> menuToEatList;

    public List<MenuToDrink> getMenuToDrinkList() {
        return menuToDrinkList;
    }

    public void setMenuToDrinkList(List<MenuToDrink> menuToDrinkList) {
        this.menuToDrinkList = menuToDrinkList;
    }

    public List<MenuToEat> getMenuToEatList() {
        return menuToEatList;
    }

    public void setMenuToEatList(List<MenuToEat> menuToEatList) {
        this.menuToEatList = menuToEatList;
    }
}
