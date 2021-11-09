package com.robinfood.encuesta.dominio.modelo;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class PreguntaModel{
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private Integer idPregunta;

	@Column(name = "pregunta")
	private String pregunta;

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pregunta")
//	private List<EncuestaPreguntaModel> encuestaPregunta;
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
                },mappedBy="preguntas")
	private Set<EncuestaModel> encuestas;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="pregunta")
	private List<RespuestaMultipleModel> respuestaMultiple;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy="pregunta")
	private List<RespuestaUnicaModel> respuestaUnica;

	public PreguntaModel() {

	}

	public PreguntaModel(String pregunta) {
		super(); 
		this.pregunta = pregunta;
	}

	
	
	public Integer getIdPregunta() {
		return idPregunta;
	}

	public void setIdPregunta(Integer idPregunta) {
		this.idPregunta = idPregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public Set<EncuestaModel> getEncuestas() {
		return encuestas;
	}

	public void setEncuestas(Set<EncuestaModel> encuestas) {
		this.encuestas = encuestas;
	}

	public List<RespuestaMultipleModel> getRespuestaMultiple() {
		return respuestaMultiple;
	}

	public void setRespuestaMultiple(List<RespuestaMultipleModel> respuestaMultiple) {
		this.respuestaMultiple = respuestaMultiple;
	}

	public List<RespuestaUnicaModel> getRespuestaUnica() {
		return respuestaUnica;
	}

	public void setRespuestaUnica(List<RespuestaUnicaModel> respuestaUnica) {
		this.respuestaUnica = respuestaUnica;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPregunta == null) ? 0 : idPregunta.hashCode());
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
		PreguntaModel other = (PreguntaModel) obj;
		if (idPregunta == null) {
			if (other.idPregunta != null)
				return false;
		} else if (!idPregunta.equals(other.idPregunta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PreguntaModel [idPregunta=" + idPregunta + ", pregunta=" + pregunta + "]";
	}

	 
	
	 

}
