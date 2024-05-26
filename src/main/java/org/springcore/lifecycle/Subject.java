package org.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
    private String subject;
    public Subject(){}
    public Subject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                '}';
    }
    @PostConstruct
    public void start(){
        System.out.println("start method");
    }
    @PreDestroy
    public void end(){
        System.out.println("end method");
    }
}
