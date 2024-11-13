package com.pluralsight.Toppings;

import com.pluralsight.AbstractClasses.Topping;

public class RegularTopping extends Topping {
    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double getPrice(int size) {
        return 0;
    }

}
