package com.ventas.services;

import com.ventas.bo.ClienteBo;
import com.ventas.entities.Cliente;
import com.ventas.entities.Vendedor;
import com.ventas.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteService {
    
    public Cliente getClienteByCodigo(String codigo) throws Exception{
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Cliente cliente = null;
        try {
            cliente = new ClienteBo().getClienteByCodigo(codigo);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return cliente;
    }
    
    public void deleteCliente(Cliente cliente) throws Exception{
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();
       Transaction tx = session.beginTransaction();
       try{
          new ClienteBo().deleteCliente(cliente);
          tx.commit();
       }
       catch(Exception ex){
           tx.rollback();
           throw new Exception (ex);
       }
    }

    public void saveCliente(Cliente cliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new ClienteBo().saveCliente(cliente);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
    }

    public List<Cliente> getAllClientes() throws Exception {
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            clientes = new ClienteBo().getAllClientes();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getAllClientesActivos() throws Exception {
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            clientes = new ClienteBo().getAllClientesActivos();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public Integer getCantidad() throws Exception {
        Integer can = 0;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            can = new ClienteBo().getCantidad();
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return can;
    }

    public void updateCliente(Cliente cliente) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new ClienteBo().updateCliente(cliente);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
    }
    
    public List<Cliente> getClienteByPagina(int paginaActual) throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClienteByPagina(paginaActual);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public int getClientesCount() throws Exception{
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        int count = 0;
        try{
            count = new ClienteBo().getClientesCount();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return count;
    }
    
    public List<Cliente> getClienteOrdenado() throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClientesOrdenado();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getAllClientesOrdenadoByPagina(Integer pagina, Integer limite) throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getAllClientesOrdenadoByPagina(pagina, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getUltimos(Integer orden, Integer limite) throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getUltimos(orden, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getUltimosByFiltro(String filtro, Integer orden, Integer limite) throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getUltimosByFiltro(filtro, orden, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public Long getUltimoId() throws Exception {
        long id = 0L;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            id = new ClienteBo().getUltimoId();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return id;
    }
    
    
    public List<Cliente> getClientesByFiltro(String filtro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesByFiltro(filtro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesByFiltroPaginado(String filtro, Integer pagina, Integer limite) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesByFiltroPaginado(filtro, pagina, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesComienzaByFiltro(String filtro, Integer pagina, Integer limite) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesComienzaByFiltro(filtro, pagina, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesByFiltroNumerico(String filtro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesByFiltroNumerico(filtro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesByFiltroNumericoPaginado(String filtro, Integer pagina, Integer limite) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesByFiltroNumericoPaginado(filtro, pagina, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesInactivosByFiltroOrdenado(String filtro) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try{
            clientes = new ClienteBo().getClientesInactivosByFiltroOrdenado(filtro);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public void saveListaClientes(List<Cliente> listaClientes) throws Exception {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try {
            new ClienteBo().saveListaClientes(listaClientes);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
    }
    
    public List<Cliente> getClienteOrdenadoPorNumero() throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClientesOrdenadoPorNumero();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesOrdenadoPorNumeroPaginado(Integer pagina, Integer limite) throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClientesOrdenadoPorNumeroPaginado(pagina, limite);
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClienteDeudores() throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClientesDeudores();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getAllClienteConSaldo() throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getAllClientesConSaldo();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getClientesConSaldoInactivos() throws Exception{
        List<Cliente> clientes = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        try{
            clientes = new ClienteBo().getClientesConSaldoInactivos();
            tx.commit();
        }catch(Exception ex){
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
    
    public List<Cliente> getByVendedor(Vendedor vendedor) throws Exception{
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Cliente> clientes = null;
        try {
            clientes = new ClienteBo().getByVendedor(vendedor);
            tx.commit();
        } catch (Exception ex) {
            tx.rollback();
            throw new Exception(ex);
        }
        return clientes;
    }
}
