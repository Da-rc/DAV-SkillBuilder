package org.darc.back.back_dav.skillbuilder.repositories;

import org.darc.back.back_dav.skillbuilder.model.Clase;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClaseRepository extends CrudRepository<Clase, Integer> {
    Optional<Clase> findByNombre(String name);
}
