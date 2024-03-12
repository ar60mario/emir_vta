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
public class VendedorAcumulado {
    private Long id;
    private Double importe;
    private Vendedor vendedor;
    private Date fechaUltimoMovimiento;

    public VendedorAcumulado() {
    }

    public VendedorAcumulado(Long id, Double importe, Vendedor vendedor, Date fechaUltimoMovimiento) {
        this.id = id;
        this.importe = importe;
        this.vendedor = vendedor;
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(Date fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }
    
}
