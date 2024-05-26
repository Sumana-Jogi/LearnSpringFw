package org.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main6 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("stereotypeconfig.xml");
        Student student=context.getBean("student",Student.class);
        System.out.println(student);
        Student student1=context.getBean("student",Student.class);

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
