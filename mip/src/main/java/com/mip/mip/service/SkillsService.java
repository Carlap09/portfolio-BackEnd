package com.mip.mip.service;

import com.mip.mip.model.Skills;
import com.mip.mip.repository.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;

    @Autowired

    public SkillsService(SkillsRepo skillsRepo){
        this.skillsRepo =skillsRepo;
    }

    public Skills addSkills(Skills skills){
        return skillsRepo.save(skills);

    }

    public List<Skills> buscarSkills(){
        return skillsRepo.findAll();
    }
    public Skills editarSkills(Skills skills){
        return skillsRepo.save(skills);
    }

    public void borrarSkills(Long id){
        skillsRepo.deleteById(id);
    }


}
