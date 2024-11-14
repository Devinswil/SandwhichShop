package com.pluralsight.Products;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Interface.IPriceable;

public class Chips extends Merchandise {
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
        return  type + " Chips"  ;
    }

}
