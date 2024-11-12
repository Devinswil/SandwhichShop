package com.pluralsight.AbstractClasses;

public abstract class PremiumTopping extends Topping {
    private String name;

    public PremiumTopping(String name) {
        super(name);
    }


    public abstract double getPrice(String size);


}
