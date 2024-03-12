/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.services;

import com.ventas.bo.UsuarioBo;
import com.ventas.entities.Usuario;
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
public class UsuarioService {

    public List<Usuario> getAllRubros() throws Exception {
        List<Usuario> listaRubro = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            UsuarioBo bo = new UsuarioBo();
            listaRubro = bo.getAllRubros();
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return listaRubro;
    }
    public void saveRubro(Usuario rubro)  throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new UsuarioBo().saveRubro(rubro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
    }

    public void updateRubro(Usuario rubro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new UsuarioBo().updateRubro(rubro);
            tx.commit();
        }
        catch(HibernateException ex){
            tx.rollback();
            throw new HibernateException (ex);
        }
    }

    public void deleteRubro(Usuario rubroABorrar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new UsuarioBo().deleteRubro(rubroABorrar);
            tx.commit();
        }
        catch (Exception ex){
            tx.rollback();
            throw new Exception (ex);
        }
    }
    
    public Usuario getRubroByCodigo(Integer codigo) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Usuario rubro = null;
        try {
            rubro = new UsuarioBo().getUsuarioByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }
}
