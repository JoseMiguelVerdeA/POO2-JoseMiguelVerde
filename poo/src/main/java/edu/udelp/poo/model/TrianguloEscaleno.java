package edu.udelp.poo.model;

public class TrianguloEscaleno extends AbstractTriangulo {

	public TrianguloEscaleno(Double lado1, Double lado2, Double base, Double altura) {
		super(lado1, lado2, base, altura);
	}

	@Override
	public String nombrefigura() {
		return "Triangulo Escaleno";
	}

}
