package com.pluralsight.Receipt;

import com.pluralsight.AbstractClasses.Merchandise;
import com.pluralsight.Products.Chips;
import com.pluralsight.Products.Drink;
import com.pluralsight.Products.Sandwich;
import com.pluralsight.UserInterface.Cart;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ReceiptFileManager {

    public void saveReceipt(Cart cart, Merchandise merchandise) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "Receipt" + time.format(formatter) + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write("********Dev-lious Subs********\n");
            bw.newLine();
            System.out.println("1(800)Dev-lious\n");
            System.out.println("Manager Devin\n");
           if (merchandise instanceof Sandwich){
               bw.write((int) ((Sandwich) merchandise).getSize());
               bw.write(((Sandwich) merchandise).getBreadType());
               bw.write(String.valueOf(((Sandwich) merchandise).isToasted()));
               bw.write(((Sandwich) merchandise).getToppings().toString());
               bw.write((int) ((Sandwich) merchandise).getCostOfSandwich());
           }
           if (merchandise instanceof Chips){
               bw.write(((Chips) merchandise).getType());
               bw.write((int) merchandise.getPrice());
           }
           if (merchandise instanceof Drink){
               bw.write(((Drink) merchandise).getFlavor());
               bw.write(((Drink) merchandise).getSize());
               bw.write((int) merchandise.getPrice());
           }

           bw.write(cart.getPri);


        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

}


