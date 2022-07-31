package com.mip.mip.controller;




import com.mip.mip.model.Educacion;
import com.mip.mip.model.Persona;
import com.mip.mip.service.PersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/persona")

public class PersonaController {
    private final PersonaService personaService;


    public PersonaController(PersonaService personaService){

        this.personaService = personaService;
    }

    @PutMapping("/update")
    public ResponseEntity<Persona> editarPersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.editarPersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK );
    }

    @GetMapping

    public ResponseEntity<List<Persona>> obtenerPersona(){
        List<Persona> personas=personaService.buscarPersonas();
        return new ResponseEntity<>(personas, HttpStatus.OK);
    }
    @PostMapping("/add")

    public ResponseEntity<Persona> addPersona(@RequestBody Persona persona){
        Persona nuevaPersona=personaService.addPersona(persona);
        return new ResponseEntity<>(nuevaPersona,HttpStatus.CREATED);
    }

}
