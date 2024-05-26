package org.springcore.springexlang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Value("#{11+22}")
    private int x;
    @Value("#{12/4}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}") // --> spExpLang for static method
    private double z;
    @Value("#{T(java.lang.Math).PI}") // --> spExpLang for static variable
    private double a;
    @Value("#{new java.lang.String('Suman Jogi')}")  // --> spExpLang for object
    private String name;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", a=" + a +
                ", name=" + name +
                '}';
    }
}
