/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maven.mavenproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author chethan
 */
public class AddToDb {
    public static void main(String[]args){
         SessionFactory sessionfactory = HibernateUtil.getSessionFactory();

        Session session = sessionfactory.openSession();
        Transaction t = session.beginTransaction();
        getMethod e1 = new getMethod();

        e1.setEmpName("ljk");
        e1.setEmpPass("sfsdf");
        session.save(e1);
        t.commit();
        session.close();
        System.out.println("successfully saved");
    }
    
}
