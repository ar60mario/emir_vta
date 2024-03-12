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
public class ClienteSaldo {
    private Long id;
    private Double saldo;
    private Boolean tieneLimiteVenta;
    private Double limiteVenta;
    private Date fechaUltimoMovimiento;
    private Cliente cliente;

    public ClienteSaldo() {
    }

    public ClienteSaldo(Long id, Double saldo, Boolean tieneLimiteVenta, Double limiteVenta, Date fechaUltimoMovimiento, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.tieneLimiteVenta = tieneLimiteVenta;
        this.limiteVenta = limiteVenta;
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
        this.cliente = cliente;
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

    public Boolean getTieneLimiteVenta() {
        return tieneLimiteVenta;
    }

    public void setTieneLimiteVenta(Boolean tieneLimiteVenta) {
        this.tieneLimiteVenta = tieneLimiteVenta;
    }

    public Double getLimiteVenta() {
        return limiteVenta;
    }

    public void setLimiteVenta(Double limiteVenta) {
        this.limiteVenta = limiteVenta;
    }

    public Date getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(Date fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
