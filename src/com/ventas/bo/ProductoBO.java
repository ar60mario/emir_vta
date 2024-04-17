/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.bo;

import com.ventas.dao.ProductoDAO;
import com.ventas.entities.Producto;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrador
 */
public class ProductoBO {

    ProductoDAO dao = new ProductoDAO();

    public List<Producto> getAllRubros() throws Exception {
        List<Producto> listaRubro = new ArrayList();
        try {
            listaRubro = dao.getAll(Producto.class);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listaRubro;
    }

    public Producto guardarRubros(Producto rubro) throws Exception {
        try {
            rubro = (Producto) dao.save(rubro);
        } catch (HibernateException ex) {
            throw new Exception();
        }
        return rubro;
    }

    public Producto saveRubro(Producto rubro) throws Exception {

        try {
            rubro = (Producto) dao.save(rubro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return rubro;
    }

    public void updateProducto(Producto producto) throws HibernateException {
        try {
            dao.update(producto);
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    public void updateListaProductos(List<Producto> productos) throws HibernateException {
        try {
            for (Producto p : productos) {
                dao.update(p);
            }
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    public void deleteRubro(Producto rubroABorrar) throws Exception {
        try {
            dao.delete(rubroABorrar);
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    public Producto getRubroByCodigo(Integer codigo) throws Exception {
        Producto rubro = null;
        try {
            rubro = dao.getByCodigo(codigo);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return rubro;
    }

    public List<Producto> getProductosByFiltro(String filtro) throws Exception {
        List<Producto> listaRubro = new ArrayList();
        try {
            listaRubro = (List<Producto>) dao.getProductosByFiltro(filtro);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return listaRubro;
    }

    public List<Producto> getAllProductosActivos() throws Exception {
        List<Producto> lista = new ArrayList();
        try {
            lista = (List<Producto>) dao.getAllProductosActivos();
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return lista;
    }

    public List<Producto> getAllProductosByCodigos(Integer co1, Integer co2) throws Exception {
        List<Producto> lista = null;
        try {
            lista = (List<Producto>) dao.getAllProductosByCodigos(co1, co2);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return lista;
    }
    
    public List<Producto> getAllProductosEntreCodigos(Integer co1, Integer co2) throws Exception {
        List<Producto> lista = null;
        try {
            lista = (List<Producto>) dao.getAllProductosEntreCodigos(co1, co2);
        } catch (HibernateException ex) {
            throw new Exception(ex);
        }
        return lista;
    }
    
    public Integer getUltimoCodigoProducto() throws Exception {
        Producto producto = null;
        Integer codigo;
        try {
            producto = dao.getUltimoProducto();
            if(producto != null){
                codigo = producto.getCodigo();
            } else {
                codigo = 0;
            }
        } catch (HibernateException ex) {
//            throw new Exception(ex);
            codigo = 0;
        }
        return codigo;
    }
}
