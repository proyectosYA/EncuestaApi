package com.robinfood.encuesta.dominio.dto;

import java.io.Serializable;
import java.util.Arrays;

public class DatosEncuestaDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String respuestaPregunta1;
	private String respuestaPregunta2;
	private String respuestaPregunta3;
	private String respuestaPregunta4;
	private OpcionRespuestaMultipleDto[] respuestaPregunta5;

	  

	public String getRespuestaPregunta1() {
		return respuestaPregunta1;
	}

	public void setRespuestaPregunta1(String respuestaPregunta1) {
		this.respuestaPregunta1 = respuestaPregunta1;
	}

	public String getRespuestaPregunta2() {
		return respuestaPregunta2;
	}

	public void setRespuestaPregunta2(String respuestaPregunta2) {
		this.respuestaPregunta2 = respuestaPregunta2;
	}

	public String getRespuestaPregunta3() {
		return respuestaPregunta3;
	}

	public void setRespuestaPregunta3(String respuestaPregunta3) {
		this.respuestaPregunta3 = respuestaPregunta3;
	}

	public String getRespuestaPregunta4() {
		return respuestaPregunta4;
	}

	public void setRespuestaPregunta4(String respuestaPregunta4) {
		this.respuestaPregunta4 = respuestaPregunta4;
	}

	public OpcionRespuestaMultipleDto[] getRespuestaPregunta5() {
		return respuestaPregunta5;
	}

	public void setRespuestaPregunta5(OpcionRespuestaMultipleDto[] respuestaPregunta5) {
		this.respuestaPregunta5 = respuestaPregunta5;
	}

	@Override
	public String toString() {
		return "DatosEncuestaDto [respuestaPregunta1=" + respuestaPregunta1 + ", respuestaPregunta2="
				+ respuestaPregunta2 + ", respuestaPregunta3=" + respuestaPregunta3 + ", respuestaPregunta4="
				+ respuestaPregunta4 + ", respuestaPregunta5=" + Arrays.toString(respuestaPregunta5) + "]";
	}

	 
	 
}
