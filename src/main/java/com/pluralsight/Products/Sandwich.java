package com.pluralsight.Products;

import com.pluralsight.AbstractClasses.Topping;
import com.pluralsight.Interface.IPriceable;


import java.util.ArrayList;
import java.util.List;

public class Sandwich implements IPriceable {
    private String breadType;
    private String size;
    private List<Topping> toppings;
    private boolean isToasted;


    public Sandwich(String breadType, String size, boolean isToasted) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
        return 0;
    }

    public double getSizePrice() {

        double sizePrice = 0;

        if (size.equalsIgnoreCase("4'")) {
            sizePrice = 4;
        } else if (size.equalsIgnoreCase("8'")) {
            sizePrice = 8;

        } else if (size.equalsIgnoreCase("12'")) {
            sizePrice = 12;

        }
        return sizePrice;
    }

    public void addTopping(Topping topping) {

        toppings.add(topping);
    }



    public void getToasted() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ding....Bread has been toasted");
    }
    

    @Override
    public String toString() {
        return "Sandwich{" +
                "breadType='" + breadType + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                ", isToasted=" + isToasted +
                '}';
    }
}


