package com.pluralsight.UserInterface;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Products.Chips;
import com.pluralsight.Products.Drink;
import com.pluralsight.Products.Sandwich;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void testIfCheckOutMethodIsWorkingRight() {
        //Arrange
        Cart cart=new Cart();
        Chips chips=new Chips("bbq");
        Drink drink = new Drink("water","large");
        Sandwich sandwich = new Sandwich("white",8,true);
        cart.addItem(chips);
        cart.addItem(drink);
        cart.addItem(sandwich);

        double expectedtotalPriceBeforeTax=7.00+1.50+3;
        double expectedSalesTax =expectedtotalPriceBeforeTax*.07;
        double expectedAfterTax= expectedSalesTax+expectedtotalPriceBeforeTax;
        double actualPrice= 12.31;



        //Act
        cart.checkOut();
        //Assert
        assertEquals(expectedAfterTax,actualPrice,0.01);
    }
}