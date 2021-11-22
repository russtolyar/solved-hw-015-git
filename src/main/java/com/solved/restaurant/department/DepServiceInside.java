package com.solved.restaurant.department;

import com.solved.restaurant.employee.Employee;

import java.util.List;

public class DepServiceInside {
    private List<Employee> serviceEmpls;
    private List<Textile> cateringTextile;
    private List<Tableware> cateringTableware;

    public List<Employee> getServiceEmpls() {
        return serviceEmpls;
    }

    public void setServiceEmpls(List<Employee> serviceEmpls) {
        this.serviceEmpls = serviceEmpls;
    }

    public List<Textile> getCateringTextile() {
        return cateringTextile;
    }

    public void setCateringTextile(List<Textile> cateringTextile) {
        this.cateringTextile = cateringTextile;
    }

    public List<Tableware> getCateringTableware() {
        return cateringTableware;
    }

    public void setCateringTableware(List<Tableware> cateringTableware) {
        this.cateringTableware = cateringTableware;
    }
}
