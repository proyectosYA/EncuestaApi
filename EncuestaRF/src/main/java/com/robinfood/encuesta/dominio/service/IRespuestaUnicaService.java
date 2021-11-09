package com.robinfood.encuesta.dominio.service;

import java.util.List;

import com.robinfood.encuesta.dominio.modelo.EncuestaModel;

public interface IRespuestaUnicaService {

	 void guardarRespuesta(List<String>respuestas,EncuestaModel encuesta);
	
}
