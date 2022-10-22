package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started..." );
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Student st = new Student();
        st.setId(102);
        st.setName("Ram");
        st.setCity("Pune");
        System.out.println(st);
        
        Address ad = new Address();
        
        ad.setStreet("street 1");
        ad.setCity("DELHI");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.65);
        
        //Reading Image
        
        FileInputStream fis = new FileInputStream("src/main/java/Screenshot (145).png");
        
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        
        session.beginTransaction();
        
        session.save(st);
        
        session.save(ad);
        
        session.getTransaction().commit();
        
        session.close();
        System.out.println("Done");
    }
}
