package com.robinfood.encuesta.dominio.service;

import com.robinfood.encuesta.dominio.dto.OpcionRespuestaMultipleDto;
import com.robinfood.encuesta.dominio.modelo.EncuestaModel;

public interface IRespuestaMultipleService {

	void guardarRespuestaMultiple(OpcionRespuestaMultipleDto[] respuestaPregunta5,EncuestaModel encuesta);
}
