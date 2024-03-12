/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.services;

import com.ventas.bo.DomicilioBo;
import com.ventas.entities.Domicilio;
import com.ventas.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mcvalls
 */
public class DomicilioService {

    public Domicilio saveDomicilio(Domicilio domicilio) throws Exception {

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            domicilio = new DomicilioBo().saveDomicilio(domicilio);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return domicilio;
    }

    public Domicilio updateDomicilio(Domicilio domicilio) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();

        try {
            domicilio = new DomicilioBo().updateDomicilio(domicilio);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }

        return domicilio;
    }

}
