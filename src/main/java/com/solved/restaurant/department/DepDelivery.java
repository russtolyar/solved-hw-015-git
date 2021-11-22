package com.solved.restaurant.department;

import com.solved.restaurant.employee.Employee;

import java.util.List;

public class DepDelivery {

    List<Employee> deliveryEmpls;
    List<Transport> deliveryTransport;
    List<Equipment> cateringEquipment;

    public List<Employee> getDeliveryEmpls() {
        return deliveryEmpls;
    }

    public void setDeliveryEmpls(List<Employee> deliveryEmpls) {
        this.deliveryEmpls = deliveryEmpls;
    }

    public List<Transport> getDeliveryTransport() {
        return deliveryTransport;
    }

    public void setDeliveryTransport(List<Transport> deliveryTransport) {
        this.deliveryTransport = deliveryTransport;
    }

    public List<Equipment> getCateringEquipment() {
        return cateringEquipment;
    }

    public void setCateringEquipment(List<Equipment> cateringEquipment) {
        this.cateringEquipment = cateringEquipment;
    }
}
