package com.robinfood.encuesta.dominio.dto;

import java.io.Serializable;
import java.util.List;

public class PreguntasDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> listaPreguntas;

	public List<String> getListaPreguntas() {
		return listaPreguntas;
	}

	public void setListaPreguntas(List<String> listaPreguntas) {
		this.listaPreguntas = listaPreguntas;
	}
	
	
}
