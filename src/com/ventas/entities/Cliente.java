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
public class Cliente {

    private Long id;
    private String codigo;
    private String razonSocial;
    private String alias;
    private String cuit;
    private String telefono;
    private String celular;
    private String mail;
    private Boolean tieneDescuento;
    private Float descuento;
    private String observaciones;
    private String entrega;
    private Boolean activo;
    private Vendedor vendedor;
    private Domicilio domicilio;
    private TipoDoc tipoDoc;
    private CategoriaIva categoriaDeIva;
    private ClienteFormaPago formaPago;

    public Cliente() {
    }

    public Cliente(Long id, String codigo, String razonSocial, String alias, String cuit, String telefono, String celular, String mail, Boolean tieneDescuento, Float descuento, String observaciones, String entrega, Boolean activo, Vendedor vendedor, Domicilio domicilio, TipoDoc tipoDoc, CategoriaIva categoriaDeIva, ClienteFormaPago formaPago) {
        this.id = id;
        this.codigo = codigo;
        this.razonSocial = razonSocial;
        this.alias = alias;
        this.cuit = cuit;
        this.telefono = telefono;
        this.celular = celular;
        this.mail = mail;
        this.tieneDescuento = tieneDescuento;
        this.descuento = descuento;
        this.observaciones = observaciones;
        this.entrega = entrega;
        this.activo = activo;
        this.vendedor = vendedor;
        this.domicilio = domicilio;
        this.tipoDoc = tipoDoc;
        this.categoriaDeIva = categoriaDeIva;
        this.formaPago = formaPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Boolean getTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(Boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public TipoDoc getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(TipoDoc tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public CategoriaIva getCategoriaDeIva() {
        return categoriaDeIva;
    }

    public void setCategoriaDeIva(CategoriaIva categoriaDeIva) {
        this.categoriaDeIva = categoriaDeIva;
    }

    public ClienteFormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(ClienteFormaPago formaPago) {
        this.formaPago = formaPago;
    }

}
