package org.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotationautowireconfig.xml");
        Emp emp1 = context.getBean("emp1", Emp.class);
        System.out.println(emp1);
    }
}
