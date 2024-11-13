package com.pluralsight.AbstractClasses;

import com.pluralsight.Interface.IPriceable;

public abstract class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice(int size);
}
