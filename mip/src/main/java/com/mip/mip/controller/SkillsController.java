package com.mip.mip.controller;

import com.mip.mip.model.Skills;
import com.mip.mip.service.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills updateSkills=skillsService.editarSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @GetMapping

    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills=skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);

    }

    @PostMapping("/add")

    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkills=skillsService.addSkills(skills);
        return new ResponseEntity<>(nuevaSkills,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarAptitudes(@PathVariable("id") Long id){
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
