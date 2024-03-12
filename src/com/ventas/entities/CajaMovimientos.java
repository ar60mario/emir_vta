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
public class CajaMovimientos {
    private Long id;
    private Date fecha;
    private Double ingreso;
    private Double egreso;
    private String referencia;
    private Boolean activo;

    public CajaMovimientos() {
    }

    public CajaMovimientos(Long id, Date fecha, Double ingreso, Double egreso, String referencia, Boolean activo) {
        this.id = id;
        this.fecha = fecha;
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.referencia = referencia;
        this.activo = activo;
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

    public Double getIngreso() {
        return ingreso;
    }

    public void setIngreso(Double ingreso) {
        this.ingreso = ingreso;
    }

    public Double getEgreso() {
        return egreso;
    }

    public void setEgreso(Double egreso) {
        this.egreso = egreso;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
