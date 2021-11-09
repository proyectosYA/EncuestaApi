package com.robinfood.encuesta.dominio.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "respuesta_multiple")
public class RespuestaMultipleModel  { 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="hamburguesa")
	private boolean hamburguesa;

	@Column(name="pizza_pollo")
	private boolean pizzaPollo;

	@Column(name="pizza_pepperoni")
	private boolean pizzaPepperoni;

	@Column(name="burrito")
	private boolean burrito;
	
//	@Column(name="numero_pregunta")
//	private int numeroPregunta;
//	
//	@Column(name="numero_respuesta")
//	private int numeroRespuesta;

	@ManyToOne()
	@JoinColumn(name = "numero_encuesta")
	private EncuestaModel encuesta;

	@ManyToOne()
	@JoinColumn(name = "numero_pregunta")
	private PreguntaModel pregunta;

	public RespuestaMultipleModel() {

	}
	

	public RespuestaMultipleModel(boolean hamburguesa, boolean pizzaPollo, boolean pizzaPepperoni, boolean burrito,
			EncuestaModel encuesta, PreguntaModel pregunta) {
		super();
		this.hamburguesa = hamburguesa;
		this.pizzaPollo = pizzaPollo;
		this.pizzaPepperoni = pizzaPepperoni;
		this.burrito = burrito;
		this.encuesta = encuesta;
		this.pregunta = pregunta;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isHamburguesa() {
		return hamburguesa;
	}

	public void setHamburguesa(boolean hamburguesa) {
		this.hamburguesa = hamburguesa;
	}

	public boolean isPizzaPollo() {
		return pizzaPollo;
	}

	public void setPizzaPollo(boolean pizzaPollo) {
		this.pizzaPollo = pizzaPollo;
	}

	public boolean isPizzaPepperoni() {
		return pizzaPepperoni;
	}

	public void setPizzaPepperoni(boolean pizzaPepperoni) {
		this.pizzaPepperoni = pizzaPepperoni;
	}

	public boolean isBurrito() {
		return burrito;
	}

	public void setBurrito(boolean burrito) {
		this.burrito = burrito;
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
		result = prime * result + id;
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
		RespuestaMultipleModel other = (RespuestaMultipleModel) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RespuestaMultipleModel [id=" + id + ", hamburguesa=" + hamburguesa + ", pizzaPollo=" + pizzaPollo
				+ ", pizzaPepperoni=" + pizzaPepperoni + ", burrito=" + burrito + ", encuesta=" + encuesta
				+ ", pregunta=" + pregunta + "]";
	}
 

	 
}
