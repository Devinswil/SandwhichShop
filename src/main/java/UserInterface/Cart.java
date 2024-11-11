package UserInterface;

import Interface.IPriceable;
import Products.Chips;
import Products.Drink;
import Products.Sandwich;

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
