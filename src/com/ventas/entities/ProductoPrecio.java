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
public class ProductoPrecio {
    private Long id;
    private Integer unidadesPorCaja;
    private Integer unidadesPorBulto;
    private Integer unidadesPorPallet;
    private Double precioCosto;
    private Double precioLista1;
    private Double precioLista2;
    private Double precioLista3;
    private Double impuesto;
    private Producto producto;

    public ProductoPrecio() {
    }

    public ProductoPrecio(Long id, Integer unidadesPorCaja, Integer unidadesPorBulto, Integer unidadesPorPallet, 
            Double precioCosto, Double precioLista1, Double precioLista2, Double precioLista3, Double impuesto, 
            Producto producto) {
        this.id = id;
        this.unidadesPorCaja = unidadesPorCaja;
        this.unidadesPorBulto = unidadesPorBulto;
        this.unidadesPorPallet = unidadesPorPallet;
        this.precioCosto = precioCosto;
        this.precioLista1 = precioLista1;
        this.precioLista2 = precioLista2;
        this.precioLista3 = precioLista3;
        this.precioLista3 = precioLista3;
        this.impuesto = impuesto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUnidadesPorCaja() {
        return unidadesPorCaja;
    }

    public void setUnidadesPorCaja(Integer unidadesPorCaja) {
        this.unidadesPorCaja = unidadesPorCaja;
    }

    public Integer getUnidadesPorBulto() {
        return unidadesPorBulto;
    }

    public void setUnidadesPorBulto(Integer unidadesPorBulto) {
        this.unidadesPorBulto = unidadesPorBulto;
    }

    public Integer getUnidadesPorPallet() {
        return unidadesPorPallet;
    }

    public void setUnidadesPorPallet(Integer unidadesPorPallet) {
        this.unidadesPorPallet = unidadesPorPallet;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getPrecioLista1() {
        return precioLista1;
    }

    public void setPrecioLista1(Double precioLista1) {
        this.precioLista1 = precioLista1;
    }

    public Double getPrecioLista2() {
        return precioLista2;
    }

    public void setPrecioLista2(Double precioLista2) {
        this.precioLista2 = precioLista2;
    }

    public Double getPrecioLista3() {
        return precioLista3;
    }

    public void setPrecioLista3(Double precioLista3) {
        this.precioLista3 = precioLista3;
    }

    public Double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Double impuesto) {
        this.impuesto = impuesto;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
}
