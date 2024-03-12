/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entities;

import java.util.Date;

/**
 *
 * @author argia
 */
public class Comprobante {
    private Long id;
    private Date fecha;
    private Integer tipoComprobante;
    private Integer sucursal;
    private Integer numero;
    private Double total;
    private Double costo;
    private Double pagado;
    private Cliente cliente;

    public Comprobante() {
    }

    public Comprobante(Long id, Date fecha, Integer tipoComprobante, Integer sucursal, Integer numero, Double total, Double costo, Double pagado, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.tipoComprobante = tipoComprobante;
        this.sucursal = sucursal;
        this.numero = numero;
        this.total = total;
        this.costo = costo;
        this.pagado = pagado;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Integer getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(Integer tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public Integer getSucursal() {
        return sucursal;
    }

    public void setSucursal(Integer sucursal) {
        this.sucursal = sucursal;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPagado() {
        return pagado;
    }

    public void setPagado(Double pagado) {
        this.pagado = pagado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
