package com.robinfood.encuesta.dominio.puerto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.dominio.modelo.EncuestaModel;

@Repository
public interface EncuestaRepository extends JpaRepository<EncuestaModel, Integer>{

}
