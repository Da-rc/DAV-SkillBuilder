package org.darc.back.back_dav.skillbuilder.services.impl;

import org.darc.back.back_dav.skillbuilder.model.Categoria;
import org.darc.back.back_dav.skillbuilder.repositories.CategoriaRepository;
import org.darc.back.back_dav.skillbuilder.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<Categoria> findAll() {
        return (List<Categoria>) repository.findAll();
    }
}
