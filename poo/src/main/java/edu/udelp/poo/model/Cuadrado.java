package edu.udelp.poo.model;



public class Cuadrado extends AbstractFigura{

	public Cuadrado(Double lado) {
		super(lado);
	}
	
	
	@Override
	public Double perimetro() {
		return lado * 4;
	}

	@Override
	public Double area() {
		return lado * lado;
	}

	@Override
	public Integer numLados() {
		return 4;
	}

	@Override
	public String nombrefigura() {
		return "Cuadrado";
	}
}
