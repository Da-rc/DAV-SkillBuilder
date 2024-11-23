package org.darc.back.back_dav.skillbuilder.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "clase_id")
    private Clase clase;

    @OneToMany(mappedBy = "categoria", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Habilidad> habilidades = new ArrayList<>();

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public List<Habilidad> getHabilidades() {
        return habilidades;
    }
}
