package com.mip.mip.service;

import com.mip.mip.model.SoftSkills;
import com.mip.mip.repository.SoftSkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional

public class SoftSkillsService {
    private final SoftSkillsRepo softSkillsRepo;

    @Autowired

    public SoftSkillsService(SoftSkillsRepo softSkillsRepo){
        this.softSkillsRepo =softSkillsRepo;
    }

    public SoftSkills addSoftSkills(SoftSkills softSkills){
        return softSkillsRepo.save(softSkills);

    }

    public List<SoftSkills> buscarSoftSkills(){
        return softSkillsRepo.findAll();
    }
    public SoftSkills editarSoftSkills(SoftSkills SoftSkills){
        return softSkillsRepo.save(SoftSkills);
    }

    public void borrarSoftSkills(Long id){
        softSkillsRepo.deleteById(id);
    }


}

