package org.darc.back.back_dav.skillbuilder.controller;

import org.darc.back.back_dav.skillbuilder.config.ModelMapperConfig;
import org.darc.back.back_dav.skillbuilder.dto.ClaseDto;
import org.darc.back.back_dav.skillbuilder.model.Clase;
import org.darc.back.back_dav.skillbuilder.services.ClaseService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
public class ClaseController {

    @Autowired
    private ClaseService service;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<ClaseDto>> findAll(){
        List<Clase> clases = service.findAll();
        List<ClaseDto> clasesDto = clases.stream().map(Clase -> modelMapper.map(Clase, ClaseDto.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(clasesDto);
        //return ResponseEntity.ok(clases);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> findByName(@PathVariable String name){
        Optional<Clase> claseOptional = service.findByName(name);
        if(claseOptional.isPresent()){
            ClaseDto claseDto = modelMapper.map(claseOptional.get(), ClaseDto.class);
            return ResponseEntity.ok().body(claseDto);
        }
        return ResponseEntity.notFound().build();
    }
}
