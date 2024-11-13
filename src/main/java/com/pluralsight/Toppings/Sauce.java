package com.pluralsight.Toppings;

import com.pluralsight.AbstractClasses.Topping;

public class Sauce extends Topping {
    public Sauce(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }
}


