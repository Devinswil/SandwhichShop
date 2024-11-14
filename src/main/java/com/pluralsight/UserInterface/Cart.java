package com.pluralsight.UserInterface;

import com.pluralsight.Interface.IPriceable;
import com.pluralsight.Products.Chips;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IPriceable {
    private List<IPriceable> cart;

    public Cart() {

        this.cart = new ArrayList<>();
    }

public boolean isEmpty(){
        return cart.isEmpty();
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
            System.out.println("Nothing has been ordered");
        } else {
            System.out.println("Items in cart:");
            for (IPriceable iPriceable : cart) {
                System.out.println(iPriceable.toString());

            }
        }
    }
}
