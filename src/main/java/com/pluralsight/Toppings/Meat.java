package com.pluralsight.Toppings;

import com.pluralsight.AbstractClasses.PremiumTopping;
import com.pluralsight.Products.Sandwich;

public class Meat extends PremiumTopping {

    public Meat(String name) {
        super(name);
    }



    @Override
    public double getPrice(int size) {

        switch (size) {
            case 4 :
                return 1.0;
            case 8:
                return 2.0;
            case 12:
                return 3.0;
            default:
                return 0.0;

        }
    }

    @Override
    public String toString() {
        return getName();
    }
}


