
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.services;

import com.ventas.bo.ProductoBO;
import com.ventas.entities.Producto;
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
public class ProductoService {

    public List<Producto> getAllRubros() throws Exception {
        List<Producto> listaRubro = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            ProductoBO bo = new ProductoBO();
            listaRubro = bo.getAllRubros();
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return listaRubro;
    }
    
    public void saveRubro(Producto rubro)  throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new ProductoBO().saveRubro(rubro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
    }

    public void updateListaProductos(List<Producto> productos) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new ProductoBO().updateListaProductos(productos);
            tx.commit();
        }
        catch(HibernateException ex){
            tx.rollback();
            throw new HibernateException (ex);
        }
    }
    
    public void updateProducto(Producto producto) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new ProductoBO().updateProducto(producto);
            tx.commit();
        }
        catch(HibernateException ex){
            tx.rollback();
            throw new HibernateException (ex);
        }
    }

    public void deleteRubro(Producto rubroABorrar) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            new ProductoBO().deleteRubro(rubroABorrar);
            tx.commit();
        }
        catch (Exception ex){
            tx.rollback();
            throw new Exception (ex);
        }
    }
    
    public Producto getRubroByCodigo(Integer codigo) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Producto rubro = null;
        try {
            rubro = new ProductoBO().getRubroByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }
    
    public List<Producto> getAllProductosActivos() throws Exception {
        List<Producto> lista = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            ProductoBO bo = new ProductoBO();
            lista = bo.getAllProductosActivos();
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return lista;
    }
    
    public List<Producto> getAllProductosByCodigos(Integer co1, Integer co2) throws Exception {
        List<Producto> lista = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            ProductoBO bo = new ProductoBO();
            lista = bo.getAllProductosByCodigos(co1, co2);
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return lista;
    }
    
    public List<Producto> getAllProductosEntreCodigos(Integer co1, Integer co2) throws Exception {
        List<Producto> lista = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            ProductoBO bo = new ProductoBO();
            lista = bo.getAllProductosEntreCodigos(co1, co2);
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return lista;
    }
    
    public List<Producto> getProductosByFiltro(String filtro) throws Exception {
        List<Producto> listaRubro = new ArrayList();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            ProductoBO bo = new ProductoBO();
            listaRubro = bo.getProductosByFiltro(filtro);
            tx.commit();
        }
        catch(Exception ex){
           tx.rollback();
            throw new Exception(ex);   
        }
        return listaRubro;
    }
    
    public Integer getUltimoCodigoProducto(Integer codigo) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Producto rubro = null;
        try {
            rubro = new ProductoBO().getRubroByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return rubro;
    }
}
