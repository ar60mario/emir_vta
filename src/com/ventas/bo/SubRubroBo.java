/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ventas.bo;

import com.ventas.dao.SubRubroDao;
import com.ventas.entities.SubRubro;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

/**
 *
 * @author Administrador
 */
public class SubRubroBo {
    SubRubroDao dao = new SubRubroDao();

public List<SubRubro> getAllSubRubros() throws Exception {
        List<SubRubro> listaRubro = new ArrayList();
        try{
            listaRubro = dao.getAll(SubRubro.class);
        }
        catch(HibernateException ex){
            throw new Exception(ex);
        }
        return listaRubro;
    }

    public SubRubro guardarSubRubros(SubRubro rubro) throws Exception {
        try{
            rubro = (SubRubro) dao.save(rubro);
        }
        catch(HibernateException ex){
            throw new Exception();
        }
        return rubro;
    }

    public SubRubro saveSubRubro(SubRubro rubro) throws Exception{
        
        try{
            rubro = (SubRubro) dao.save(rubro);
        }catch (HibernateException ex){
            throw new Exception(ex);
        }
        return rubro;
    }

    public void updateSubRubro(SubRubro rubro) throws HibernateException{
        try{
            dao.update(rubro);
        } catch(HibernateException ex){
            throw new HibernateException (ex);
        }
    }

    public void deleteSubRubro(SubRubro subRubroABorrar) throws Exception{
        try{ 
            dao.delete(subRubroABorrar);
        } catch(HibernateException ex){
            throw new HibernateException (ex);    
        }
    }
    
    public SubRubro getSubRubroByCodigo(Integer codigo) throws Exception {
        SubRubro subRubro = null;
        try{
            subRubro = dao.getByCodigo(codigo);
        }catch(HibernateException ex){
            throw new Exception(ex);
        }
        return subRubro;
    }
}
