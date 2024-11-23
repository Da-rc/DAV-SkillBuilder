package org.darc.back.back_dav.skillbuilder.dto;

import org.darc.back.back_dav.skillbuilder.model.Habilidad;

import java.util.List;

public class CategoriaDto {
    private int id;
    private String nombre;
    private List<HabilidadDto> habilidades;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<HabilidadDto> getHabilidades() {
        return habilidades;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabilidades(List<HabilidadDto> habilidades) {
        this.habilidades = habilidades;
    }
}
