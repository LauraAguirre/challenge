package com.test.challenge.domain.services;

import com.test.challenge.domain.Persona;
import com.test.challenge.infraestructure.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona save(Persona persona) {
        System.out.println("llego al servicio :"+persona.toString());
        return personaRepository.save(persona);
    }

    public List<Persona> findAll() {
        List<Persona> personas = personaRepository.findAll();
        System.out.println(personas.size());
        return personas;
    }

    public Persona findById(Long id) {
        return personaRepository.findById(id).orElse(null);
    }
}