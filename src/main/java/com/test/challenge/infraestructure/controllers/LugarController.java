package com.test.challenge.infraestructure.controllers;

import com.test.challenge.domain.Lugar;
import com.test.challenge.domain.services.LugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("lugares") // http://localhost:8080/lugares
public class LugarController {

    @Autowired
    private LugarService lugarService;

    @PostMapping("crear")
    public Lugar createLugar(@RequestBody Lugar lugar) {
        return lugarService.save(lugar);
    }

    @GetMapping("/pais/{pais}")
    public List<Lugar> getLugaresByPais(@PathVariable String pais) {
        return lugarService.findByPais(pais);
    }

    @GetMapping("/persona/{personaId}")
    public List<Lugar> getLugaresByPersonaId(@PathVariable Long personaId) {
        return lugarService.findByPersonaId(personaId);
    }
}