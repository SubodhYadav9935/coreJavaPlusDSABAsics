package org.example;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Hibernate {
    @Id
    private String name;

    private int rollno;
    private String add;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String   toString() {
        return "Hibernate{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", add='" + add + '\'' +
                '}';
    }
}
