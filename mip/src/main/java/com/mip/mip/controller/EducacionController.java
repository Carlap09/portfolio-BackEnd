package com.mip.mip.controller;

import com.mip.mip.model.Educacion;
import com.mip.mip.service.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService){
        this.educacionService = educacionService;
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educaciones=educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion=educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }
}
