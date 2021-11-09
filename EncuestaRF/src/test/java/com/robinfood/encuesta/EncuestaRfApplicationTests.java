package com.robinfood.encuesta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import com.robinfood.encuesta.dominio.modelo.EncuestaModel;
import com.robinfood.encuesta.dominio.modelo.PreguntaModel;
import com.robinfood.encuesta.dominio.puerto.repositorio.EncuestaRepository;
import com.robinfood.encuesta.dominio.puerto.repositorio.PreguntaRepository;
import com.robinfood.encuesta.dominio.service.EncuestaService;
import com.robinfood.encuesta.dominio.service.PreguntaService;

@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
class EncuestaRfApplicationTests {
	
	@Mock
	private PreguntaRepository preguntaRepository;
	
	@Mock
	private EncuestaRepository encuestaRepository;
	
	@InjectMocks
	private PreguntaService preguntaService;
	
	@InjectMocks
	private EncuestaService encuestaService;
	
	
	private List<String> listaPreguntas;
	
	private List<PreguntaModel> objetosPregunta;
	 
	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		
		listaPreguntas = new ArrayList<>();
		listaPreguntas.add("¿Cual menú te gustaría que estuviese?");
		listaPreguntas.add("¿Qué le gustaría que mejoráramos?");
		listaPreguntas.add("¿Cómo le pareció el servició prestado por nuestros colaboradores?");
		listaPreguntas.add("¿Cuál es su genero?"); 
		
		objetosPregunta = new ArrayList<>();
		objetosPregunta.add(new PreguntaModel("¿Cual menú te gustaría que estuviese?"));
		objetosPregunta.add(new PreguntaModel("¿Cuál es su genero?"));
		 
	}

	@Test
	void obtenerPreguntasTest() {
		when(preguntaService.obtenerPreguntas()).thenReturn(listaPreguntas);
		
		List<String> listaPreguntas = preguntaService.obtenerPreguntas();
		
		assertNotNull(listaPreguntas);
		assertEquals(4, listaPreguntas.size());
		
		
	}
	
	@Test
	void obtenerObjetosPreguntasTest() {
		when(preguntaService.obtenerObjectos()).thenReturn(objetosPregunta);
		
		List<PreguntaModel> lista = preguntaService.obtenerObjectos();
		
		assertNotNull(lista);
		assertEquals(2, lista.size());
	}

	@Test
	void guardarEncuestaTest() {
		EncuestaService mock = Mockito.mock(EncuestaService.class);
		when(mock.guardarEncuesta()).thenReturn(new EncuestaModel(new Date()));
		assertEquals(new Date(), mock.guardarEncuesta().getFecha());
		 assertNotNull(mock);
		 Mockito.verify(mock).guardarEncuesta();
		 
	}
}
