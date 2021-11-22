package com.solved.restaurant;

import com.solved.restaurant.department.DepDelivery;
import com.solved.restaurant.department.DepKitchen;
import com.solved.restaurant.department.DepServiceInside;
import com.solved.restaurant.menu.Menu;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurant {

    private String name;
    private LocalDateTime dateOfFoundation;
    private Menu menu;
    private List<Client> clients;
    private DepKitchen depKitchen;
    private DepServiceInside depServiceInside;
    private DepDelivery depDelivery;

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

    public DepKitchen getDepKitchen() {
        return depKitchen;
    }

    public void setDepKitchen(DepKitchen depKitchen) {
        this.depKitchen = depKitchen;
    }

    public DepServiceInside getDepServiceInside() {
        return depServiceInside;
    }

    public void setDepServiceInside(DepServiceInside depServiceInside) {
        this.depServiceInside = depServiceInside;
    }

    public DepDelivery getDepDelivery() {
        return depDelivery;
    }

    public void setDepDelivery(DepDelivery depDelivery) {
        this.depDelivery = depDelivery;
    }
}
