package com.org.hmkHibernate;

import org.hibernate.Transaction;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    

	public static void main( String[] args )
    {
    	Bean bean = new Bean();
    	/*bean.setId(1);
    	bean.setName("Aarif");
    	*/
    	Configuration cf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bean.class);
    	SessionFactory sf = cf.buildSessionFactory();
        Session session = sf.openSession();
       
        session.beginTransaction();
        bean = session.get(Bean.class,1);
       System.out.println(bean);
       session.getTransaction().commit();

      /*  
        Transaction tx = session.beginTransaction();
       
        int obj =(Integer)session.save(bean);
        System.out.println(obj);
        tx.commit();
        session.close();*/
    }
}
