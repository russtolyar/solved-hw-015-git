package com.solved.restaurant;

import com.solved.restaurant.department.Kitchen;
import com.solved.restaurant.menu.Menu;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurant {

    private String name;
    private LocalDateTime dateOfFoundation;
    private Menu menu;
    private List<Client> clients;
    private Kitchen kitchen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(LocalDateTime dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Kitchen getDepKitchen() {
        return kitchen;
    }

    public void setDepKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

}
