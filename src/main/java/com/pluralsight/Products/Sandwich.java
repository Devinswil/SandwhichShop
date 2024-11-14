package com.pluralsight.Products;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.AbstractClasses.Topping;
import com.pluralsight.Interface.IPriceable;


import java.util.ArrayList;
import java.util.List;

public class Sandwich extends Merchandise {
    private String breadType;
    private int size;
    private List<Topping> toppings;
    private boolean isToasted;


    public Sandwich(String breadType, int size, boolean isToasted) {
        this.breadType = breadType;
        this.size = size;
        this.toppings = new ArrayList<>();
        this.isToasted = isToasted;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public void setToasted(boolean toasted) {
        isToasted = toasted;
    }

    @Override
    public double getPrice() {
        double sandPrice = 0;
        sandPrice += getBasePrice();
        for (Topping topping : toppings) {
            sandPrice += topping.getPrice(size);

        }
        return sandPrice;
    }

    public double getBasePrice() {

        double sizePrice = 0;

        if (size == 4) {
            sizePrice = 5.50;
        } else if (size == 8) {
            sizePrice = 7.00;

        } else if (size == 12) {
            sizePrice = 8.50;

        }
        return sizePrice;
    }

    public void addTopping(Topping topping) {

        toppings.add(topping);
    }


    public void getToasted() {
        if (isToasted) {
            System.out.println("toasting your sandwich");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Ding....Sandwich has been toasted");
        }
    }


    @Override
    public String toString() {
        return "Sandwich " +
                "is a" + size + '\'' +
                ", inch " + breadType + "sub "+'\'' +
                ", with" + toppings +"on it"+
                ", isToasted=" + (isToasted ? "yes": "no") ;
    }
}


