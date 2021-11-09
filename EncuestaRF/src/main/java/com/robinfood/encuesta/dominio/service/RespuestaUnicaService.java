package com.robinfood.encuesta.dominio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.modelo.EncuestaModel;
import com.robinfood.encuesta.dominio.modelo.PreguntaModel;
import com.robinfood.encuesta.dominio.modelo.RespuestaUnicaModel;
import com.robinfood.encuesta.dominio.puerto.repositorio.PreguntaRepository;
import com.robinfood.encuesta.dominio.puerto.repositorio.RespuestaUnicaRepository;

@Service
public class RespuestaUnicaService implements IRespuestaUnicaService {

	@Autowired
	private RespuestaUnicaRepository respuestaUnicaRepository;

	@Autowired
	private PreguntaRepository preguntaRepository;

	@Override
	public void guardarRespuesta(List<String>respuestas, EncuestaModel encuesta) {
		List<RespuestaUnicaModel> objetos = new ArrayList<>();
		
		 
		// obtener objetos pregunta de la base de datos
		List<PreguntaModel> listaObjetosRespuesta = preguntaRepository.obtenerObjetos();
	 
		
		for (int i = 0; i < listaObjetosRespuesta.size()-1; i++) {
			objetos.add(new RespuestaUnicaModel(respuestas.get(i), encuesta, listaObjetosRespuesta.get(i)));
		}
 

		 respuestaUnicaRepository.saveAll(objetos);

	}

}
