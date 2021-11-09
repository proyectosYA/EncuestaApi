package com.robinfood.encuesta.dominio.modelo;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "encuesta") 
public class EncuestaModel   {
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_encuesta")
	private int idEncuesta;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
//	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="encuesta")
//	private List<EncuestaPreguntaModel> encuestaPregunta;

	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
                })
	@JoinTable(name = "encuesta_pregunta",
    joinColumns = { @JoinColumn(name = "encuesta_id")},
    	inverseJoinColumns = { @JoinColumn(name = "pregunta_id") })
	private Set<PreguntaModel> preguntas =new HashSet<>();
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="encuesta")
	private List<RespuestaUnicaModel> respuestaUnica;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="encuesta")
	private List<RespuestaMultipleModel> respuestaMultiple;
	
	public EncuestaModel(){}
 

	public EncuestaModel(Date fecha) {
		super(); 
		this.fecha = fecha;
	}
  

	public int getIdEncuesta() {
		return idEncuesta;
	}


	public void setIdEncuesta(int idEncuesta) {
		this.idEncuesta = idEncuesta;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Set<PreguntaModel> getPreguntas() {
		return preguntas;
	}


	public void setPreguntas(Set<PreguntaModel> preguntas) {
		this.preguntas = preguntas;
	}


	public List<RespuestaUnicaModel> getRespuestaUnica() {
		return respuestaUnica;
	}


	public void setRespuestaUnica(List<RespuestaUnicaModel> respuestaUnica) {
		this.respuestaUnica = respuestaUnica;
	}


	public List<RespuestaMultipleModel> getRespuestaMultiple() {
		return respuestaMultiple;
	}


	public void setRespuestaMultiple(List<RespuestaMultipleModel> respuestaMultiple) {
		this.respuestaMultiple = respuestaMultiple;
	}

	//
//	public List<EncuestaPreguntaModel> getEncuestaPregunta() {
//		return encuestaPregunta;
//	}
//
//
//	public void setEncuestaPregunta(List<EncuestaPreguntaModel> encuestaPregunta) {
//		this.encuestaPregunta = encuestaPregunta;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEncuesta;
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
		EncuestaModel other = (EncuestaModel) obj;
		if (idEncuesta != other.idEncuesta)
			return false;
		return true;
	} 
}
