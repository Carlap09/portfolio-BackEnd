package com.mip.mip.service;

import com.mip.mip.model.Educacion;
import com.mip.mip.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo){
        this.educacionRepo =educacionRepo;
    }

    public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion) ;

    }
    public List<Educacion> buscarEducaciones(){
        return educacionRepo.findAll();
    }

    public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
    }

    public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
    }

}
