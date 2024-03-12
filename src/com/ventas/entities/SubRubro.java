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
public class SubRubro {
    private Long id;
    private Integer codigo;
    private String nombre;
    private Boolean activo;
    private Boolean lista;

    public SubRubro() {
    }

    public SubRubro(Long id, Integer codigo, String nombre, Boolean activo, Boolean lista) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
        this.lista = lista;
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

    public Boolean getLista() {
        return lista;
    }

    public void setLista(Boolean lista) {
        this.lista = lista;
    }
    
}
