package com.robinfood.encuesta.dominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.modelo.PreguntaModel;
import com.robinfood.encuesta.dominio.puerto.repositorio.PreguntaRepository;

@Service
public class PreguntaService implements IPreguntaService {

	@Autowired
	private PreguntaRepository preguntaRepository;
	
	@Override
	public List<String> obtenerPreguntas() { 
		return preguntaRepository.obtenerPreguntas();
	}

	@Override
	public List<PreguntaModel> obtenerObjectos() { 
		List<PreguntaModel> objetosRespuesta = preguntaRepository.obtenerObjetos(); 
		
		return objetosRespuesta;
	}

}
