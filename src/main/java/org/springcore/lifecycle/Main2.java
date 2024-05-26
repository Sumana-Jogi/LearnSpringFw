package org.springcore.lifecycle;

import org.springcore.setterinjection.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycleconfig.xml");
//        Samosa samosa1 = (Samosa) context.getBean("samosa1");
//        System.out.println(samosa1);
        context.registerShutdownHook();

//        Pepsi pep1 = (Pepsi) context.getBean("pep1");
//        System.out.println(pep1);

        Subject sub1 = (Subject) context.getBean("sub1");
        System.out.println(sub1);
    }
}
