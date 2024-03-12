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
public class Caja {
    private Long id;
    private Date fecha;
    private Double saldoAnterior;
    private Double ingresos;
    private Double egresos;
    private Double nuevoSaldo;
    private Date fechaAnterior;

    public Caja() {
    }

    public Caja(Long id, Date fecha, Double saldoAnterior, Double ingresos, Double egresos, Double nuevoSaldo, Date fechaAnterior) {
        this.id = id;
        this.fecha = fecha;
        this.saldoAnterior = saldoAnterior;
        this.ingresos = ingresos;
        this.egresos = egresos;
        this.nuevoSaldo = nuevoSaldo;
        this.fechaAnterior = fechaAnterior;
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

    public Double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(Double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }

    public Double getEgresos() {
        return egresos;
    }

    public void setEgresos(Double egresos) {
        this.egresos = egresos;
    }

    public Double getNuevoSaldo() {
        return nuevoSaldo;
    }

    public void setNuevoSaldo(Double nuevoSaldo) {
        this.nuevoSaldo = nuevoSaldo;
    }

    public Date getFechaAnterior() {
        return fechaAnterior;
    }

    public void setFechaAnterior(Date fechaAnterior) {
        this.fechaAnterior = fechaAnterior;
    }
    
}
