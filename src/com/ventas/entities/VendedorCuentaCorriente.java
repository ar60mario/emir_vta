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
public class VendedorCuentaCorriente {
    private Long id;
    private Date fecha;
    private Double debe;
    private Double haber;
    private Double saldo;
    private Double comision;
    private Comprobante comprobante;

    public VendedorCuentaCorriente() {
    }

    public VendedorCuentaCorriente(Long id, Date fecha, Double debe, Double haber, Double saldo, Double comision, Comprobante comprobante) {
        this.id = id;
        this.fecha = fecha;
        this.debe = debe;
        this.haber = haber;
        this.saldo = saldo;
        this.comision = comision;
        this.comprobante = comprobante;
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

    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }

    
}
