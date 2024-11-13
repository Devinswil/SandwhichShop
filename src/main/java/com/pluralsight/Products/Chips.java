package com.pluralsight.Products;

import com.pluralsight.Interface.IPriceable;

public class Chips {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Chips(String type) {
        this.type = type;
    }


    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return "Chips " + type ;
    }

}
