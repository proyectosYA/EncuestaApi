package com.robinfood.encuesta.dominio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robinfood.encuesta.dominio.dto.OpcionRespuestaMultipleDto;
import com.robinfood.encuesta.dominio.modelo.EncuestaModel;
import com.robinfood.encuesta.dominio.modelo.PreguntaModel;
import com.robinfood.encuesta.dominio.modelo.RespuestaMultipleModel;
import com.robinfood.encuesta.dominio.puerto.repositorio.PreguntaRepository;
import com.robinfood.encuesta.dominio.puerto.repositorio.RespuestaMultipleRepository;

@Service
public class RespuestaMultipleService implements IRespuestaMultipleService{
	
	@Autowired
	private RespuestaMultipleRepository respuestaRepository;
	
	@Autowired
	private PreguntaRepository preguntaRepository;

	 

	@Override
	public void guardarRespuestaMultiple(OpcionRespuestaMultipleDto[] respuestaPregunta5, EncuestaModel encuesta) {
		boolean comida1 = respuestaPregunta5[0].isBurrito();
		boolean comida2  =respuestaPregunta5[0].isHamburguesa();
		boolean comida3=respuestaPregunta5[0].isPizzaPepperoni();
		boolean comida4 =respuestaPregunta5[0].isPizzaPollo();
	 
		List<PreguntaModel> listaObjetosRespuesta = preguntaRepository.obtenerObjetos();
		
		RespuestaMultipleModel objeto =  new RespuestaMultipleModel(comida1, 
				comida2, comida3, comida4, encuesta, listaObjetosRespuesta.get(4));
		 
		  
		respuestaRepository.save(objeto);
		
	}

}
