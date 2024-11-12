package com.pluralsight.UserInterface;

import com.pluralsight.Interface.IPriceable;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IPriceable {
    private String name;

   private List<IPriceable>cart;


    public Cart(String name) {
        this.name = name;
        this.cart=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void addItem(){}
    public void displayCart(){}
}
