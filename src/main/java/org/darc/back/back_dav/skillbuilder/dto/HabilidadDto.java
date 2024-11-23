package org.darc.back.back_dav.skillbuilder.dto;

public class HabilidadDto {
    private int id;
    private String nombre;
    private String descripcion;
    private int posicion;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
