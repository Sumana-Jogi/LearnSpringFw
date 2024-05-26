package org.springcore.lifecycle;

public class Samosa {
    private double price;
    public Samosa(){}
    public Samosa(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("inside setter");
        this.price = price;
    }

    @Override
    public String toString() {
        return "price= " + price ;
    }

    public void init(){
        System.out.println("inside init");
    }
    public void destroy(){
        System.out.println("inside destroy");
    }
}
