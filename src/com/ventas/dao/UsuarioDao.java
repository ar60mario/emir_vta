/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.dao;

import com.ventas.entities.Usuario;
import com.ventas.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author Administrador
 */
public class UsuarioDao extends GenericDao{

    public Usuario getByCodigo(Integer codigo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Usuario.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        Usuario rubro = (Usuario) criteria.uniqueResult();
        return rubro;
    }
    
//    public <T> List getAllOrdenado(Class<T> clase) throws HibernateException {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Criteria criteria = session.createCriteria(clase);
//        criteria.addOrder(Order.asc("codigo"));
//        return criteria.list();
//    }
//    
}
