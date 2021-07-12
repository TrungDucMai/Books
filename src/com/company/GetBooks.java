package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GetBooks {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Books Array[] = new Books[2];
        System.out.println("Enter your book's info here :");
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Book code :");
            double code = input.nextDouble();
            String fix1 = input.nextLine();
            System.out.println("Book's name :");
            String name = input.nextLine();
            System.out.println("Book's price");
            double price = input.nextDouble();
            String fix2 = input.nextLine();
            System.out.println("Book's author");
            String author = input.nextLine();
            Array[i] = new Books(code, name, price, author);
            System.out.println("Book " + (i + 1) + Array[i]);
        }

        //Tim ten sach
        System.out.println("Enter the book's name :");
        String searchName = input.nextLine();
        for (int i = 0; i < Array.length; i++) {
            if (searchName.equals(Array[i].getName())) {
                System.out.println("we have your book !");
                break;
            } else {
                System.out.println("not avaliavle");
                break;
            }

        }
        //tim theo gia tien
        System.out.println("Enter the book's price");
        Double searchPrice = input.nextDouble();
        for (int i = 0; i < Array.length; i++) {
            if (searchPrice.equals(Array[i].getPrice())) {
                System.out.println("we have your book !");
                break;
            } else {
                System.out.println("not avaliavle");
                break;
            }

        }
        // tinh tong tien sach
        System.out.println("Price of 6 books");
        double sumPrice = 0;
        for (int i = 0; i < Array.length; i++) {
            sumPrice += Array[i].getPrice();
        }
        System.out.println(" The total price is :");
        System.out.println(sumPrice);

        Array.toString();
    }
}