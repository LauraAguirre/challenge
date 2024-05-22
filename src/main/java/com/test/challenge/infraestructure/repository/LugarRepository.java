package com.test.challenge.infraestructure.repository;

import com.test.challenge.domain.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LugarRepository extends JpaRepository<Lugar, Long> {
    List<Lugar> findByPais(String pais);

    @Query(value = "SELECT * FROM LUGARES WHERE id_persona = :id",nativeQuery = true)
    List<Lugar> findByPersona( @Param("id") Long personaId);
}