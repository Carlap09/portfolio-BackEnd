package com.mip.mip.repository;

import com.mip.mip.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;




public interface PersonaRepo extends JpaRepository <Persona, Long> {


}