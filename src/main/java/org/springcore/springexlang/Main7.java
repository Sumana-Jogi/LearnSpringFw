package org.springcore.springexlang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main7 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springExprLang.xml");
        Demo demo = context.getBean("demo",Demo.class);
        System.out.println(demo);
    }
}
