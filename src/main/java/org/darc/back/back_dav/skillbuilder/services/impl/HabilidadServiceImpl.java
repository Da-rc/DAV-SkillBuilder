package org.darc.back.back_dav.skillbuilder.services.impl;

import org.darc.back.back_dav.skillbuilder.model.Habilidad;
import org.darc.back.back_dav.skillbuilder.repositories.HabilidadRepository;
import org.darc.back.back_dav.skillbuilder.services.HabilidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabilidadServiceImpl implements HabilidadService {

    @Autowired
    private HabilidadRepository repository;

    @Override
    public List<Habilidad> findAll() {
        return (List<Habilidad>) repository.findAll();
    }
}
