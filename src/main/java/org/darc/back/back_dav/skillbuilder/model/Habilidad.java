package org.darc.back.back_dav.skillbuilder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "habilidades")
public class Habilidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    private String descripcion;

    private int posicion;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPosicion() {
        return posicion;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
