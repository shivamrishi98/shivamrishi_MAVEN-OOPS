package com.chitkara.chocolates;

public class chocolates implements Comparable<chocolates> {
      private String name;
      private int price;
      private int weight;

    public chocolates(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }





    @Override
    public int compareTo(chocolates choco) {

        if (choco.price < price) {
            return -1;
        } else if (choco.price > price) {
            return 1;
        } else {
            return 0;
        }
    }



    @Override
    public String toString() {
        return "Chocolate " +
                "name:'" + name + '\'' +
                ", price:" + price +
                ", weight:" + weight;
    }
}
