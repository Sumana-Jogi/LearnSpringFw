package org.springcore.constrinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constrinjectnconfig.xml");
        Person person1 = (Person) context.getBean("person1");
        System.out.println(person1);
    }
}
