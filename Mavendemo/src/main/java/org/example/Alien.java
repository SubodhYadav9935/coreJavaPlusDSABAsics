package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity // it will change the table name if table created with new table in the xml file we uses create rather then update
//@Table(name = "alien_tableeeeeee")
public class Alien {
    @Id
    private int aId;
//    @Column(name = "alienName")
    private String aName;
//    @Transient   //it is used for iggnoring data entry in the database
    private String tech;
    @OneToMany(fetch = FetchType.LAZY)
    private List<Laptop> laptops;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", tech='" + tech + '\'' +
                ", laptops=" + laptops +
                '}';
    }
}
