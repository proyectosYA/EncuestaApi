package com.robinfood.encuesta.dominio.puerto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.modelo.RespuestaUnicaModel;

@Service
public interface RespuestaUnicaRepository extends JpaRepository<RespuestaUnicaModel, Integer>{

}
