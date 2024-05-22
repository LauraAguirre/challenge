package com.test.challenge.infraestructure.controllers;

import com.test.challenge.domain.Persona;
import com.test.challenge.domain.dtos.PersonaDTO;
import com.test.challenge.domain.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @PostMapping
    public Persona createPersona (@RequestBody PersonaDTO persona) {
        return personaService.save(new Persona(persona.getId_persona(),
                persona.getNombre(),
                persona.getEdad(),
                persona.getOcupacion()));
    }

    @GetMapping
    public List<Persona> getAllPersonas() {
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public Persona getPersonaById (@PathVariable Long id) {
        return personaService.findById(id);
    }
}