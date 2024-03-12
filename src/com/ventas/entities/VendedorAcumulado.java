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
    private Date fechaUltimoMovimiento;

    public VendedorAcumulado() {
    }

    public VendedorAcumulado(Long id, Double importe, Date fechaUltimoMovimiento) {
        this.id = id;
        this.importe = importe;
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

    public Date getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(Date fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

}
