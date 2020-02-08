package com.chitkara.gifts;

import com.chitkara.chocolates.chocolates;
import com.chitkara.sweets.sweets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class gift
{
    static private List<chocolates> chocolates;
    static private List<sweets> sweets;

    public gift() {
         chocolates = new ArrayList<>();
         sweets = new ArrayList<>();

    }

    public void addChocolates(chocolates chocolate){
         chocolates.add(chocolate);
    }





    static public void showChocolates() {
        for (int i = 0; i < chocolates.size(); i++) {
            System.out.println((i + 1) + " " + chocolates.get(i));
        }
    }



    public void addSweets(sweets sweet)
    {
        sweets.add(sweet);
    }


   static public void showSweets() {
        for (int i = 0; i < sweets.size(); i++) {
            System.out.println((i + 1) + " " + sweets.get(i));
        }
    }



    public int findTotalWeight(){
        int weight=0;

        for(chocolates c: this.chocolates)
            weight+=c.getWeight();
        for(sweets s: this.sweets)
            weight+=s.getWeight();

        return weight;
    }

    public void mostExpensiveChocolate()
    {
        Collections.sort(chocolates);
        System.out.println("Most Expensive Chocolate"+chocolates.get(0).toString());
    }

    public void mostExpensiveSweet()
    {
        Collections.sort(sweets);
        System.out.println("Most Expensive Sweet"+sweets.get(0).toString());
    }

    static public void sortChoice(int c)
    {

        switch(c)
        {
            case 1:
                Collections.sort(chocolates);
              showChocolates();
                break;
            case 2:
                Collections.sort(sweets);
                showSweets();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}
