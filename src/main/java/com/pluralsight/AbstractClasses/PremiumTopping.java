package com.pluralsight.AbstractClasses;

public abstract class PremiumTopping extends Topping {
    private String name;

    public PremiumTopping(String name) {
        super(name);
    }


    public abstract double getPrice(int size);

    @Override
    public String toString() {
        return "PremiumTopping "+ name ;
    }
}
