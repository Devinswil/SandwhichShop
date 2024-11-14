package com.pluralsight.AbstractClasses;

import com.pluralsight.Interface.IPriceable;

public abstract class  Merchandise implements IPriceable {
    @Override
    public double getPrice() {
        return 0;
    }
}
