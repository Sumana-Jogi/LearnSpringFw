package org.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowireconfig.xml");
        Emp emp1 = context.getBean("emp1",Emp.class);
        System.out.println(emp1);
    }
}
