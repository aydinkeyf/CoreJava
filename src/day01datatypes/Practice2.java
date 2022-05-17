package day01datatypes;

import java.util.Scanner;


public class Practice2 {
    public static void main(String[] args) {
        double price, taxedPrice, taxAmount, unTaxedPrice, tax = 0.085;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter product price: ");

        price = input.nextDouble();

        taxAmount = price * tax;
        taxedPrice = price + taxAmount;

        System.out.println("Price without Tax: " + price);
        System.out.println("Tax: " + tax);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Taxed Amount: " + taxedPrice);





    }
}
