package com.solved.restaurant;

import com.solved.restaurant.department.DepDelivery;
import com.solved.restaurant.department.DepKitchen;
import com.solved.restaurant.department.DepServiceInside;
import com.solved.restaurant.employee.Employee;
import com.solved.restaurant.menu.Menu;

import java.time.LocalDateTime;
import java.util.List;

public class Restaurant {

    private  String name;
    private LocalDateTime dateOfFoundation;
    private List<Menu>menus;
    private List<Client> client;
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

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
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
