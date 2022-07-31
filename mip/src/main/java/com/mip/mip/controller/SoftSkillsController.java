package com.mip.mip.controller;




import com.mip.mip.model.SoftSkills;
import com.mip.mip.service.SoftSkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/softSkills")

public class SoftSkillsController {
    private final SoftSkillsService softSkillsService;

    public SoftSkillsController(SoftSkillsService softSkillsService){
        this.softSkillsService = softSkillsService;
    }

    @PutMapping("/update")
    public ResponseEntity<SoftSkills> editarSoftSkills(@RequestBody SoftSkills softSkills){
        SoftSkills updateSoftSkills=softSkillsService.editarSoftSkills(softSkills);
        return new ResponseEntity<>(updateSoftSkills, HttpStatus.OK);
    }

    @GetMapping

    public ResponseEntity<List<SoftSkills>> obtenerSoftSkills(){
        List<SoftSkills> softSkills=softSkillsService.buscarSoftSkills();
        return new ResponseEntity<>(softSkills, HttpStatus.OK);

    }

    @PostMapping("/add")

    public ResponseEntity<SoftSkills> crearSoftSkills(@RequestBody SoftSkills softSkills){
        SoftSkills nuevaSoftSkills=softSkillsService.addSoftSkills(softSkills);
        return new ResponseEntity<>(nuevaSoftSkills,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrar(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);

    }

}


