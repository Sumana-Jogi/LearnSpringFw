package org.springcore.configfree;

import org.springframework.stereotype.Component;


public class Student {
    private Chocolate chocolate;

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public Student(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    public void studentDisplay(){
        chocolate.chocoChip();
        System.out.println("inside Student method");
    }
}
