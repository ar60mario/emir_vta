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
public class Producto {
    private Long id;
    private Integer codigo;
    private String detalle;
    private Boolean activo;
    private ProductoPrecio precio;
    private ProductoCodigoBarras codigoBarras;
    private ProductoStock stock;

    public Producto() {
    }

    public Producto(Long id, Integer codigo, String detalle, Boolean activo, ProductoPrecio precio, ProductoCodigoBarras codigoBarras, ProductoStock stock) {
        this.id = id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.activo = activo;
        this.precio = precio;
        this.codigoBarras = codigoBarras;
        this.stock = stock;
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

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public ProductoPrecio getPrecio() {
        return precio;
    }

    public void setPrecio(ProductoPrecio precio) {
        this.precio = precio;
    }

    public ProductoCodigoBarras getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(ProductoCodigoBarras codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public ProductoStock getStock() {
        return stock;
    }

    public void setStock(ProductoStock stock) {
        this.stock = stock;
    }
    
}
