package com.solved.restaurant.department;

import java.util.List;

public class Tableware {

    List<Plate> plates;
    List<Cutlery> cutleries;
    List<Glass> glasses;

    public List<Plate> getPlates() {
        return plates;
    }

    public void setPlates(List<Plate> plates) {
        this.plates = plates;
    }

    public List<Cutlery> getCutleries() {
        return cutleries;
    }

    public void setCutleries(List<Cutlery> cutleries) {
        this.cutleries = cutleries;
    }

    public List<Glass> getGlasses() {
        return glasses;
    }

    public void setGlasses(List<Glass> glasses) {
        this.glasses = glasses;
    }
}
