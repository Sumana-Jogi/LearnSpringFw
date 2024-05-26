package org.springcore.setterinjection;

import org.springcore.setterinjection.collections.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);

        ApplicationContext context1 = new ClassPathXmlApplicationContext("collectionconfig.xml");
        Employee emp1 = (Employee) context1.getBean("emp1");
        System.out.println(emp1);

        ApplicationContext context2 = new ClassPathXmlApplicationContext("refconfig.xml");
        A a1 = (A)context2.getBean("a1");
        B b1 = (B)context2.getBean("b1");

        System.out.println(a1);
        System.out.println(b1);
    }
}