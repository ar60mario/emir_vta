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
public class Saldo {
    private Long id;
    private Double saldo;
    private Date fecha;
    private Double saldo2;

    public Saldo() {
    }

    public Saldo(Long id, Double saldo, Date fecha, Double saldo2) {
        this.id = id;
        this.saldo = saldo;
        this.fecha = fecha;
        this.saldo2 = saldo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getSaldo2() {
        return saldo2;
    }

    public void setSaldo2(Double saldo2) {
        this.saldo2 = saldo2;
    }
    
    
}
