package com.pluralsight.Products;

import com.pluralsight.AbstractClasses.AllToppings;
import com.pluralsight.Interface.IPriceable;

import java.util.List;

public class Sandwich implements IPriceable {
    private String breadType;
    private String size;
   private List<AllToppings>toppings;
    private boolean isToasted;

    public Sandwich(String breadType, String size, List<AllToppings> toppings, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.toppings = toppings;
        this.isToasted = isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<AllToppings> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        return 0;
    }
    public void addToppings(){}

    public void addSauce(){}
    public void getToasted(){}

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                ", isToasted=" + isToasted +
                '}';
    }
}

