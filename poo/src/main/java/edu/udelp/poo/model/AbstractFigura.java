package edu.udelp.poo.model;

import lombok.Data;

@Data
public abstract class AbstractFigura implements Figura{

	protected Double lado;
	
	public AbstractFigura(Double lado) {
		
		this.lado = lado;
		
	}
	
	public abstract Integer numLados();
	public abstract String nombrefigura();
	
	public void getResultados() {
		
		System.out.println("La figura: " + nombrefigura());
		System.out.println("Lados: " + numLados());
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
		
	}
	
}
