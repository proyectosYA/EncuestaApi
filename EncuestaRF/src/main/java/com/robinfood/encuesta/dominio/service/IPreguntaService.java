package com.robinfood.encuesta.dominio.service;

import java.util.List;

import com.robinfood.encuesta.dominio.modelo.PreguntaModel;

public interface IPreguntaService {
	
	List<String> obtenerPreguntas(); 
	List<PreguntaModel> obtenerObjectos();
	
	 

}
