package com.chitkara;

import com.chitkara.chocolates.DairyMilk;
import com.chitkara.chocolates.FiveStar;
import com.chitkara.chocolates.MilkyBar;

import com.chitkara.gifts.gift;
import com.chitkara.sweets.sweet1;
import com.chitkara.sweets.sweet2;
import com.chitkara.sweets.sweet3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      gift shop = new gift();
    shop.addChocolates(new DairyMilk());
    shop.addChocolates(new FiveStar());
    shop.addChocolates(new MilkyBar());



        shop.addSweets(new sweet1());
        shop.addSweets(new sweet2());
        shop.addSweets(new sweet3());







        boolean exit = false;

        while (!exit) {
            printItems();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                     exit = true;
                    break;
                case 1:
                      shop.showChocolates();
                    break;
                case 2:
                    shop.showSweets();
                    break;
                case 3:
                    shop.mostExpensiveChocolate();
                    shop.mostExpensiveSweet();
                    break;
                case 4:
                    System.out.println("Total Weight of Gifts : "+shop.findTotalWeight());
                    break;

                default:
                    printItems();

            }


        }

         sortInstructions();
        gift.sortChoice(sc.nextInt());



    }


    private static void printItems() {
        System.out.println("Press 1 to see chocolates\n" +
                "Press 2 to see sweets\n" + "Press 3 to get most expensive chocolate and sweets\n" + "Press 4 to see total weight of gift\n"+
                "Press 0 to exit");
    }


    private static void sortInstructions() {
        System.out.println("Press 1 to sort the Chocolate by Price\n"+"Press 2 to sort the Sweets by Price");
    }


}








