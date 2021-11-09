package com.robinfood.encuesta.dominio.puerto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.robinfood.encuesta.dominio.modelo.PreguntaModel;

@Repository
public interface PreguntaRepository extends JpaRepository<PreguntaModel, Integer>{
	
	@Query("select p.pregunta from PreguntaModel p")
	List<String> obtenerPreguntas();

	@Query("select p from PreguntaModel p")
	List<PreguntaModel> obtenerObjetos();
}
