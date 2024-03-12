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
public class ClienteCuentaCorriente {
    private Long id;
    private Date fecha;
    private Integer codigoComprobante;
    private Double debe;
    private Double haber;
    private Double saldo;
    private Cliente cliente;
    private Comprobante comprobante;
    private Recibo recibo;

    public ClienteCuentaCorriente() {
    }

    public ClienteCuentaCorriente(Long id, Date fecha, Integer codigoComprobante, Double debe, Double haber, Double saldo, Cliente cliente, Comprobante comprobante, Recibo recibo) {
        this.id = id;
        this.fecha = fecha;
        this.codigoComprobante = codigoComprobante;
        this.debe = debe;
        this.haber = haber;
        this.saldo = saldo;
        this.cliente = cliente;
        this.comprobante = comprobante;
        this.recibo = recibo;
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

    public Integer getCodigoComprobante() {
        return codigoComprobante;
    }

    public void setCodigoComprobante(Integer codigoComprobante) {
        this.codigoComprobante = codigoComprobante;
    }

    public Double getDebe() {
        return debe;
    }

    public void setDebe(Double debe) {
        this.debe = debe;
    }

    public Double getHaber() {
        return haber;
    }

    public void setHaber(Double haber) {
        this.haber = haber;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }
    
    
}
