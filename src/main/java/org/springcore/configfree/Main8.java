package org.springcore.configfree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main8 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);
        Student student = context.getBean("sumanStudent", Student.class);
        System.out.println(student);
        student.studentDisplay();
    }
}
