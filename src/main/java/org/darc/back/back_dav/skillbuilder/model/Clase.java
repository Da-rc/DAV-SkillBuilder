package org.darc.back.back_dav.skillbuilder.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="clases")
public class Clase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @OneToMany(mappedBy = "clase", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Categoria> categorias=new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }
}
