package org.springcore.constrinjection;

public class Certification {
    private String certi;
    public Certification(String certi) {
        this.certi = certi;
    }
    @Override
    public String toString() {
        return "Certification{" +
                "certi='" + certi + '\'' +
                '}';
    }
}
