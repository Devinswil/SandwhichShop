package com.pluralsight.Toppings;

import com.pluralsight.AbstractClasses.PremiumTopping;
import com.pluralsight.Products.Sandwich;

public class Meat extends PremiumTopping {
    private Sandwich sandwich;

    public Meat(String name, Sandwich sandwich) {
        super(name);
        this.sandwich = sandwich;
    }


    @Override
    public double getPrice() {
        String sandwichSize = sandwich.getSize();
        switch (sandwichSize) {
            case "4'":
                return 1.0;
            case "8'":
                return 2.0;
            case "12'":
                return 3.0;
            default:
                return 0.0;

        }

    }
}
