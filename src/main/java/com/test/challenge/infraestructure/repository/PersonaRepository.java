package com.test.challenge.infraestructure.repository;

import com.test.challenge.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
