package org.springcore.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person person1 =context.getBean("person1",Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println(person1.getFeeStr().getClass().getName());

    }
}
