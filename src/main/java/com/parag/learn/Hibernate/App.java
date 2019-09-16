package com.parag.learn.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       System.out.println( "Alien World!" );
       
       Alien a = new Alien();
       AlienName name = new AlienName();
       
       a.setAlien_id(1004);
       a.setAlien_name(name);
       a.setPlanet("Earth");
       
       
       name.firstname="Parag";
       name.middleName="Ashok";
       name.lastName="Ghodaskar";       
    		   
        Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory sf =config.buildSessionFactory(); 
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(a);
        a=(Alien) session.get(Alien.class,1002);
        tx.commit();
        
        System.out.println(a);
        
    }
}
