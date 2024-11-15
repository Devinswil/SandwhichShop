package com.pluralsight.Products;

import com.pluralsight.Toppings.Cheese;
import com.pluralsight.Toppings.Meat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SandwichTest {

    @Test
    void getPrice() {
        //Arrange
        Sandwich sandwich= new Sandwich("white",12,true);
        String cheese = "american";
        String meat = "Steak";
        sandwich.addTopping(new Cheese(cheese));
        sandwich.addTopping(new Meat(meat));
        double expectedPrice=13.75;
        //Act
        double acutalPrice=sandwich.getPrice();
        //Assert
        assertEquals(expectedPrice,acutalPrice);
    }

    @Test
    void getBasePrice() {
        //Arrange
        Sandwich sandwich= new Sandwich("white",12,true);
        double expectedSandwichsize=8.50;

        //Act
        double actualPrice=sandwich.getBasePrice();
        //assert
        assertEquals(expectedSandwichsize,actualPrice);

    }
}