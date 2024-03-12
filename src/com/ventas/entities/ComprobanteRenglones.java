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
public class ComprobanteRenglones {
    private Long id;
    private Integer cantidad;
    private Double costo;
    private Double total;
    private Double sugerido;
    private Double unitarioCosto;
    private Double unitarioVenta;
    private Producto producto;
    private Comprobante comprobante;

    public ComprobanteRenglones() {
    }

    public ComprobanteRenglones(Long id, Integer cantidad, Double costo, Double total, Double sugerido, Double unitarioCosto, Double unitarioVenta, Producto producto, Comprobante comprobante) {
        this.id = id;
        this.cantidad = cantidad;
        this.costo = costo;
        this.total = total;
        this.sugerido = sugerido;
        this.unitarioCosto = unitarioCosto;
        this.unitarioVenta = unitarioVenta;
        this.producto = producto;
        this.comprobante = comprobante;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getSugerido() {
        return sugerido;
    }

    public void setSugerido(Double sugerido) {
        this.sugerido = sugerido;
    }

    public Double getUnitarioCosto() {
        return unitarioCosto;
    }

    public void setUnitarioCosto(Double unitarioCosto) {
        this.unitarioCosto = unitarioCosto;
    }

    public Double getUnitarioVenta() {
        return unitarioVenta;
    }

    public void setUnitarioVenta(Double unitarioVenta) {
        this.unitarioVenta = unitarioVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Comprobante getComprobante() {
        return comprobante;
    }

    public void setComprobante(Comprobante comprobante) {
        this.comprobante = comprobante;
    }
    
}
