/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.bo;

import com.ventas.dao.UsuarioDao;
import com.ventas.entities.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrador
 */
public class UsuarioBo {
    UsuarioDao dao = new UsuarioDao();

public List<Usuario> getAllRubros() throws Exception {
        List<Usuario> listaRubro = new ArrayList();
        try{
            listaRubro = dao.getAll(Usuario.class);
        }
        catch(HibernateException ex){
            throw new Exception(ex);
        }
        return listaRubro;
    }

    public Usuario guardarRubros(Usuario rubro) throws Exception {
        try{
            rubro = (Usuario) dao.save(rubro);
        }
        catch(HibernateException ex){
            throw new Exception();
        }
        return rubro;
    }

    public Usuario saveRubro(Usuario rubro) throws Exception{
        
        try{
            rubro = (Usuario) dao.save(rubro);
        }catch (HibernateException ex){
            throw new Exception(ex);
        }
        return rubro;
    }

    public void updateRubro(Usuario rubro) throws HibernateException{
        try{
            dao.update(rubro);
        } catch(HibernateException ex){
            throw new HibernateException (ex);
        }
    }

    public void deleteRubro(Usuario rubroABorrar) throws Exception{
        try{ 
            dao.delete(rubroABorrar);
        } catch(HibernateException ex){
            throw new HibernateException (ex);    
        }
    }
    
    public Usuario getUsuarioByCodigo(Integer codigo) throws Exception {
        Usuario rubro = null;
        try{
            rubro = dao.getByCodigo(codigo);
        }catch(HibernateException ex){
            throw new Exception(ex);
        }
        return rubro;
    }
}
