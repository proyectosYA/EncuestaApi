package com.robinfood.encuesta.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robinfood.encuesta.dominio.dto.DatosEncuestaDto;
import com.robinfood.encuesta.dominio.dto.PreguntasDto;
import com.robinfood.encuesta.dominio.modelo.EncuestaModel;
import com.robinfood.encuesta.dominio.service.IEncuestaService;
import com.robinfood.encuesta.dominio.service.IPreguntaService;
import com.robinfood.encuesta.dominio.service.IRespuestaMultipleService;
import com.robinfood.encuesta.dominio.service.IRespuestaUnicaService;

@RestController
@RequestMapping()
public class EncuestaController {
 

	@Autowired
	private IPreguntaService preguntaRepository;
 

	@Autowired
	private IRespuestaUnicaService respuestaService;
	
	@Autowired
	private IEncuestaService encuestaService;
	
	@Autowired
	private IRespuestaMultipleService respuestaMultipleservice;

	@GetMapping("/preguntas")
	public ResponseEntity<PreguntasDto> obtenerPreguntas() { 
 
		PreguntasDto preguntas = new PreguntasDto();
		List<String> listaPreguntas = preguntaRepository.obtenerPreguntas();
		if(listaPreguntas.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		preguntas.setListaPreguntas(listaPreguntas);  
		return ResponseEntity.ok(preguntas);
	}

	@PostMapping("/")
	public ResponseEntity<String> guardarEncuesta(@RequestBody DatosEncuestaDto datosEncuesta) {
 
		List<String> respuestas = new ArrayList<>();
		 
		 respuestas.add(datosEncuesta.getRespuestaPregunta1());
		 respuestas.add(datosEncuesta.getRespuestaPregunta2());
		 respuestas.add(datosEncuesta.getRespuestaPregunta3());
		 respuestas.add(datosEncuesta.getRespuestaPregunta4());
		 
 		// guardar encuesta  
		 EncuestaModel encuesta = encuestaService.guardarEncuesta(); 
		 if(encuesta != null) {
			 respuestaService.guardarRespuesta(respuestas, encuesta);
			 respuestaMultipleservice.guardarRespuestaMultiple(datosEncuesta.getRespuestaPregunta5(), encuesta);
			 return new ResponseEntity<>(HttpStatus.OK);
		 }
		 
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 
 
	}
}
