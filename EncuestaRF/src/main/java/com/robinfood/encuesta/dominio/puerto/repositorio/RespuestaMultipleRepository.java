package com.robinfood.encuesta.dominio.puerto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.modelo.RespuestaMultipleModel;

@Service
public interface RespuestaMultipleRepository extends JpaRepository<RespuestaMultipleModel, Integer> {

}
