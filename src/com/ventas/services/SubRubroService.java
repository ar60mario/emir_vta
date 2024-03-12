/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.services;

import com.ventas.bo.SubRubroBo;
import com.ventas.entities.SubRubro;
import com.ventas.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Administrador
 */
public class SubRubroService {

    public List<SubRubro> getAllSubRubros() throws Exception {
        List<SubRubro> listaRubro = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            SubRubroBo bo = new SubRubroBo();
            listaRubro = bo.getAllSubRubros();
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return listaRubro;
    }
    public void saveSubRubro(SubRubro rubro)  throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new SubRubroBo().saveSubRubro(rubro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
    }

    public void updateSubRubro(SubRubro rubro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new SubRubroBo().updateSubRubro(rubro);
            tx.commit();
        }
        catch(HibernateException ex){
            tx.rollback();
            throw new HibernateException (ex);
        }
    }

    public void deleteSubRubro(SubRubro rubroABorrar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new SubRubroBo().deleteSubRubro(rubroABorrar);
            tx.commit();
        }
        catch (Exception ex){
            tx.rollback();
            throw new Exception (ex);
        }
    }
    
    public SubRubro getRubroByCodigo(Integer codigo) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        SubRubro rubro = null;
        try {
            rubro = new SubRubroBo().getSubRubroByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }
}
