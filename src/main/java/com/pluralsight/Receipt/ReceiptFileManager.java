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

    public void saveReceipt(Cart cart) {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "Receipt" + time.format(formatter) + ".txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write("********Dev-lious Subs********\n");
            bw.write("1(800)Dev-lious\n");
            bw.write("Manager Devin\n");
            for (Merchandise merchandise : cart.getCart()) {
                if (merchandise instanceof Sandwich sandwich) {
                    //casting merchandise to sandwich in order to have access
                    bw.write("Sandwich:\n");
                    bw.write( sandwich.getSize() + " inch ");
                    bw.write(sandwich.getBreadType() + " Bread ");
                    bw.write("is toasted " + (sandwich.isToasted()));
                    bw.write(" with " + sandwich.getToppings().toString() + " on it\n");
                    bw.write("Price: $" + String.format("%.2f", sandwich.getPrice()) + "\n\n");
                }
                if (merchandise instanceof Chips chip) {
                    bw.write("Chips\n");
                    bw.write(chip.getType() + " Chips" + "\n");
                    bw.write("Price: $" + String.format("%.2f", chip.getPrice()) + "\n\n");
                }
                if (merchandise instanceof Drink drink) {
                    bw.write("Drink\n");
                    bw.write("Flavor " + drink.getFlavor() + "\n");
                    bw.write("Size " + drink.getSize() + "\n");
                    bw.write("Price: $" + String.format("%.2f", drink.getPrice()) + "\n\n");
                }
            }
            bw.write("---------------------\n");
            bw.write("Total Amount: $" + String.format("%.2f", cart.receiptPrice()) + "\n");
            bw.write("---------------------\n");

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}


