package com.test.challenge.domain.services;

import com.test.challenge.domain.Lugar;
import com.test.challenge.infraestructure.repository.LugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarService {
    @Autowired
    private LugarRepository lugarRepository;

    public Lugar save(Lugar lugar) {
        return lugarRepository.save(lugar);
    }

    public List<Lugar> findByPais(String pais) {
        return lugarRepository.findByPais(pais);
    }

    public List<Lugar> findByPersonaId(Long personaId) {
        return lugarRepository.findByPersona(personaId);
    }
}