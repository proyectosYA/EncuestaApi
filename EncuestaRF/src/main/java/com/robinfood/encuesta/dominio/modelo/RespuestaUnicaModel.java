package com.robinfood.encuesta.dominio.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="respuesta_unica")
public class RespuestaUnicaModel   {
	 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRespUni;
	
	private String respuesta;
	
//	@Column(name="numero_pregunta")
//	private Integer numeroPregunta;
	
//	@Column(name="numero_encuesta")
//	private Integer numeroEncuesta;
	
	@ManyToOne()
	@JoinColumn(name="numero_encuesta")
	private EncuestaModel encuesta;
	
	@ManyToOne()
	@JoinColumn(name="numero_pregunta")
	private PreguntaModel pregunta;

	public RespuestaUnicaModel() {}
 

	public RespuestaUnicaModel( String respuesta, EncuestaModel encuesta, PreguntaModel pregunta) {
		super(); 
		this.respuesta = respuesta;
		this.encuesta = encuesta;
		this.pregunta = pregunta;
	}


	public Integer getIdRespUni() {
		return idRespUni;
	}


	public void setIdRespUni(Integer idRespUni) {
		this.idRespUni = idRespUni;
	}


	public String getRespuesta() {
		return respuesta;
	}


	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}


	public EncuestaModel getEncuesta() {
		return encuesta;
	}


	public void setEncuesta(EncuestaModel encuesta) {
		this.encuesta = encuesta;
	}


	public PreguntaModel getPregunta() {
		return pregunta;
	}


	public void setPregunta(PreguntaModel pregunta) {
		this.pregunta = pregunta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idRespUni == null) ? 0 : idRespUni.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RespuestaUnicaModel other = (RespuestaUnicaModel) obj;
		if (idRespUni == null) {
			if (other.idRespUni != null)
				return false;
		} else if (!idRespUni.equals(other.idRespUni))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "RespuestaUnicaModel [idRespUni=" + idRespUni + ", respuesta=" + respuesta + ", encuesta=" + encuesta
				+ ", pregunta=" + pregunta + "]";
	}


 

}
