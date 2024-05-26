package org.springcore.constrinjection;

public class Addition {
    private int a;
    private int b;

    public Addition(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("int,int constructor");
    }
    public Addition(double a, double b){
        this.a=(int) a;
        this.b=(int) b;
        System.out.println("double,double constructor");
    }
    public void doSum(){
        System.out.println("sum is"+ (this.a + this.b));
    }
}
