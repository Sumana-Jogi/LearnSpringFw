package org.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;
    public Pepsi(){}
    public Pepsi(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        System.out.println("inside pepsi setter");
        this.price = price;
    }

    @Override
    public String toString() {
        return "price=" + price ;
    }

    public void afterPropertiesSet() throws Exception{
        System.out.println("pepsi init using interface impl(InitializingBean) - afterPropertiesSet() method");
    }
    public void destroy() throws Exception{
        System.out.println("pepsi destroy using interface(DisposableBean) impl - destroy() method");
    }
}
