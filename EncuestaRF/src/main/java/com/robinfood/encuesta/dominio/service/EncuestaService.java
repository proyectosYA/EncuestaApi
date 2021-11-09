package com.robinfood.encuesta.dominio.service;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.modelo.EncuestaModel;
import com.robinfood.encuesta.dominio.modelo.PreguntaModel;
import com.robinfood.encuesta.dominio.puerto.repositorio.EncuestaRepository;
import com.robinfood.encuesta.dominio.puerto.repositorio.PreguntaRepository;

@Service
public class EncuestaService implements IEncuestaService {

	@Autowired
	private EncuestaRepository encuestaRepository;

	@Autowired
	private PreguntaRepository preguntaRepository;

	@Override
	public EncuestaModel guardarEncuesta() {
		EncuestaModel encuesta = null;
		try { 
			List<PreguntaModel> objetosRespuesta = preguntaRepository.obtenerObjetos();
			
			if(objetosRespuesta.isEmpty()) {
				return encuesta;
			} 
			encuesta = new EncuestaModel(new Date());
			Set<PreguntaModel> objetosPregunta = new HashSet<>(objetosRespuesta);
//			for (int i = 0; i < objetosRespuesta.size(); i++) {
//				encuesta.getPreguntas().add(objetosRespuesta.get(i));
				encuesta.getPreguntas().addAll(objetosPregunta);
//			}
			EncuestaModel encuestaRegistrada = encuestaRepository.save(encuesta);
			return encuestaRegistrada;
		} catch (Exception e) {
			return encuesta;
		}
	}

}
