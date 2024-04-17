/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.dao;

import com.ventas.entities.Cliente;
import com.ventas.entities.Producto;
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
public class ProductoDAO extends GenericDao {

    public Producto getByCodigo(Integer codigo) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.eq("codigo", codigo));
        Producto rubro = (Producto) criteria.uniqueResult();
        return rubro;
    }

    public List<Producto> getProductosByFiltro(String filtro) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.like("detalle", "%" + filtro + "%"));
        List<Producto> productos = (List<Producto>) criteria.list();
        return productos;
    }

    public <T> List getAllOrdenado(Class<T> clase) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(clase);
        criteria.addOrder(Order.asc("codigo"));
        return criteria.list();
    }

    public <T> List getAllProductosActivos() throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.eq("inactivo", false));
        criteria.addOrder(Order.asc("codigo"));
        return criteria.list();
    }

    public List<Producto> getAllProductosByCodigos(Integer co1, Integer co2) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.or(Restrictions.eq("codigo", co1),
                Restrictions.eq("codigo", co2),
                Restrictions.and(Restrictions.lt("codigo", co2),
                        Restrictions.gt("codigo", co1))));
        criteria.addOrder(Order.asc("codigo"));
        List<Producto> productos = (List<Producto>) criteria.list();
        return productos;
    }
    
    public List<Producto> getAllProductosEntreCodigos(Integer co1, Integer co2) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.add(Restrictions.or(Restrictions.eq("codigo", co1),
                Restrictions.eq("codigo", co2),
                Restrictions.and(Restrictions.lt("codigo", co2),
                        Restrictions.gt("codigo", co1))));
        criteria.addOrder(Order.asc("detalle"));
        List<Producto> productos = (List<Producto>) criteria.list();
        return productos;
    }
    
    public Producto getUltimoProducto() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Criteria criteria = session.createCriteria(Producto.class);
        criteria.addOrder(Order.desc("codigo"));
        criteria.setMaxResults(2);
        List<Producto> productos = (List<Producto>) criteria.list();
        return productos.get(0);
    }
}
