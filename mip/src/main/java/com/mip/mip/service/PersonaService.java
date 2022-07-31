package com.mip.mip.service;


import com.mip.mip.exception.PerNotFoundException;

import com.mip.mip.model.Educacion;
import com.mip.mip.model.Persona;
import com.mip.mip.repository.PersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class PersonaService {

    private final PersonaRepo personaRepo;

    @Autowired
    public PersonaService(PersonaRepo personaRepo){
        this.personaRepo =personaRepo;
    }

    public Persona editarPersona(Persona persona){
        return personaRepo.save(persona);
    }

    public List<Persona> buscarPersonas(){
        return personaRepo.findAll();
    }


    public Persona buscarPersonaPorId(Long id){
        return personaRepo.findById(id).orElseThrow(() -> new PerNotFoundException("persona no encontrada"));
    }
    public Persona addPersona(Persona persona){
        return personaRepo.save(persona);

    }

}
