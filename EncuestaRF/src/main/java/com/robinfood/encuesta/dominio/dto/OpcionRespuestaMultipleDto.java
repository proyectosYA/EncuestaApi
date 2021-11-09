package com.robinfood.encuesta.dominio.dto;

import java.io.Serializable;

public class OpcionRespuestaMultipleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private boolean burrito;
	private boolean hamburguesa;
	private boolean pizzaPepperoni;
	private boolean pizzaPollo;

	public boolean isBurrito() {
		return burrito;
	}

	public void setBurrito(boolean burrito) {
		this.burrito = burrito;
	}

	public boolean isHamburguesa() {
		return hamburguesa;
	}

	public void setHamburguesa(boolean hamburguesa) {
		this.hamburguesa = hamburguesa;
	}

	public boolean isPizzaPepperoni() {
		return pizzaPepperoni;
	}

	public void setPizzaPepperoni(boolean pizzaPepperoni) {
		this.pizzaPepperoni = pizzaPepperoni;
	}

	public boolean isPizzaPollo() {
		return pizzaPollo;
	}

	public void setPizzaPollo(boolean pizzaPollo) {
		this.pizzaPollo = pizzaPollo;
	}

	@Override
	public String toString() {
		return "DatosMultipleEncuestaDto [burrito=" + burrito + ", hamburguesa=" + hamburguesa + ", pizzaPepperoni="
				+ pizzaPepperoni + ", pizzaPollo=" + pizzaPollo + "]";
	}

	
}
