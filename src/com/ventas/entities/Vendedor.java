/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventas.entities;

/**
 *
 * @author argia
 */
public class Vendedor {
    private Long id;
    private Integer codigo;
    private String nombre;
    private Boolean activo;
    private VendedorAcumulado vendedorAcumulado;

    public Vendedor() {
    }

    public Vendedor(Long id, Integer codigo, String nombre, Boolean activo, VendedorAcumulado vendedorAcumulado) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
        this.vendedorAcumulado = vendedorAcumulado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public VendedorAcumulado getVendedorAcumulado() {
        return vendedorAcumulado;
    }

    public void setVendedorAcumulado(VendedorAcumulado vendedorAcumulado) {
        this.vendedorAcumulado = vendedorAcumulado;
    }
    
}
