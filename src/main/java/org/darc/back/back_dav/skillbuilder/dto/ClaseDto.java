package org.darc.back.back_dav.skillbuilder.dto;

import org.darc.back.back_dav.skillbuilder.model.Categoria;

import java.util.List;

public class ClaseDto {
    private int id;
    private String nombre;
    private List<CategoriaDto> categorias;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<CategoriaDto> getCategorias() {
        return categorias;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCategorias(List<CategoriaDto> categorias) {
        this.categorias = categorias;
    }
}
