package com.pluralsight.Toppings;

import com.pluralsight.AbstractClasses.PremiumTopping;
import com.pluralsight.Products.Sandwich;

public class Cheese extends PremiumTopping {
    private Sandwich sandwich;
    public Cheese(String name, Sandwich sandwich) {
        super(name);
        this.sandwich= sandwich;

    }


    @Override
    public double getPrice() {
        String sandwichSize = sandwich.getSize();
        switch (sandwichSize) {
            case "4'":
                return .75;
            case "8'":
                return 1.50;
            case "12'":
                return 2.25;
            default:
                return 0.0;

        }
    }

}
