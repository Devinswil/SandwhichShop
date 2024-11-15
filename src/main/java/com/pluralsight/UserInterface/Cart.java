package com.pluralsight.UserInterface;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Interface.IPriceable;
import com.pluralsight.Products.Chips;

import java.util.ArrayList;
import java.util.List;

public class Cart implements IPriceable{
    private List<Merchandise> cart;
    private double salesTax=.07;

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
        double preTotalAmount=getPrice();
        double afterTaxTotal= preTotalAmount + (preTotalAmount * salesTax);
        System.out.printf("Total Cost before Tax: $%.2f%n", preTotalAmount);
        System.out.printf("Total Cost after Tax: $%.2f%n", afterTaxTotal);
        clearCart();
        System.out.println("Enjoy your food!");

    }
    public void clearCart(){
        cart.clear();
    }
    public double receiptPrice(){
        double totalPrice = 0;
        for (Merchandise merchandise : cart) {
            totalPrice += merchandise.getPrice();

        }
        return totalPrice+(totalPrice*.07);

    }
}
