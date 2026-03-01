package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Hibernate h = new Hibernate();
        h.setName("subodhhhhhhhhh22");
        h.setRollno(122);
        h.setAdd("32 sant shiv nath");
        Hibernate h2 = null;*/
        Laptop laptop1 =new Laptop();
        laptop1.setLid(7);
        laptop1.setBrand("Asus");
        laptop1.setModel("0001212");
        laptop1.setRam(16);


        Laptop laptop2 =new Laptop();
        laptop2.setLid(6);
        laptop2.setBrand("Asus");
        laptop2.setModel("0001212");
        laptop2.setRam(16);

        Laptop laptop3 =new Laptop();
        laptop3.setLid(5);
        laptop3.setBrand("Asus");
        laptop3.setModel("0001212");
        laptop3.setRam(16);

        Alien alien = new Alien();
        alien.setaId(104);
        alien.setaName("Navy");
        alien.setTech("FFF");

        Alien alien1 = new Alien();
        alien1.setaId(105);
        alien1.setaName("Navy");
        alien1.setTech("FFF");

        Alien alien2 = new Alien();
        alien2.setaId(106);
        alien2.setaName("Navy");
        alien2.setTech("FFF");
        alien2.setLaptops(List.of(laptop3,laptop1));
        alien1.setLaptops(Arrays.asList(laptop2));



        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction= session.beginTransaction();
        session.persist(alien);
        session.persist(alien1);
        session.persist(alien2);
        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(laptop3);

        transaction.commit();

        Alien a = session.find(Alien.class,105); // lazy fetch
        System.out.println(a);

        session.close();
        sf.close();

//        Transaction tx = session.beginTransaction();
//        session.persist(h);
//        tx.commit();
    }
}