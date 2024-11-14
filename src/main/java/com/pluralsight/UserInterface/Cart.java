package com.pluralsight.UserInterface;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Interface.IPriceable;
import com.pluralsight.Products.Chips;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Merchandise> cart;

    public Cart() {

        this.cart = new ArrayList<>();
    }

    public boolean isEmpty() {
        return cart.isEmpty();
    }


    public double getPrice() {
        double totalPrice = 0;
        for (Merchandise merchandise : cart) {
            totalPrice += merchandise.getPrice();

        }
        return totalPrice;
    }

    public void addItem(Merchandise merchandise) {
        cart.add(merchandise);
    }


    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Nothing has been ordered");
        } else {
            System.out.println("Items in cart:");
            for (Merchandise merchandise : cart) {
                System.out.println(merchandise.toString());

            }
        }
    }
    public void checkOut(){
        if (isEmpty()){
            System.out.println("Nothing has been ordered");
            return;
        }
        double totalAmount=getPrice();
        System.out.println("Total Amount $ "+ totalAmount+ "has been deducted from your account");
        clearCart();
        System.out.println("Enjoy your food!");

    }
    public void clearCart(){
        cart.clear();
    }
}
