package org.springcore.constrinjection;

public class Person {
    private String name;
    private int id;
    private Certification certification;

    public Person(String name, int id, Certification certification) {
        this.name = name;
        this.id = id;
        this.certification=certification;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id + " " +
                certification +
                '}';
    }
}
