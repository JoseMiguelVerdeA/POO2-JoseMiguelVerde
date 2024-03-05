package edu.udelp.poo.model;

import lombok.Data;

@Data
public class TrianguloIsoseles extends AbstractTriangulo {

	public TrianguloIsoseles(Double lado1, Double base, Double altura) {
		super(lado1, lado1, base, altura);
	}
	

	@Override
	public String nombrefigura() {
		return "Triangulo Isoseles";
	}
}
