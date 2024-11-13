package com.pluralsight.UserInterface;

import com.pluralsight.Interface.IPriceable;
import com.pluralsight.Products.Chips;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IPriceable {
    private String name;
    private List<IPriceable> cart;

    public Cart(String name) {
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (IPriceable iPriceable : cart) {
            totalPrice += iPriceable.getPrice();

        }
        return totalPrice;
    }

    public void addItem(IPriceable iPriceable) {
        cart.add(iPriceable);
    }

    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Order is empty");

        } else {
            System.out.println("Items in cart:");
            for (IPriceable iPriceable : cart) {
                System.out.println(iPriceable.toString());

            }
        }
    }
}
