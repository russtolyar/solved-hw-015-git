package com.solved.restaurant.department;


import java.util.List;

public class Equipment {

    List<Furniture> cateringFurniture;
    List<Textile> cateringTextile;
    List<Tableware> cateringTableware;

    public List<Furniture> getCateringFurniture() {
        return cateringFurniture;
    }

    public void setCateringFurniture(List<Furniture> cateringFurniture) {
        this.cateringFurniture = cateringFurniture;
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
