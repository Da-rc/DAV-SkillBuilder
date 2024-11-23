package org.darc.back.back_dav.skillbuilder.services;

import org.darc.back.back_dav.skillbuilder.model.Clase;

import java.util.List;
import java.util.Optional;

public interface ClaseService {
    List<Clase> findAll();
    Optional<Clase> findByName(String name);
}
