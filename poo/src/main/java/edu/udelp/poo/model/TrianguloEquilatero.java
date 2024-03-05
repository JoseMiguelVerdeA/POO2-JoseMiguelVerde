package edu.udelp.poo.model;

import lombok.Data;

@Data
public class TrianguloEquilatero extends AbstractTriangulo{
	
	public TrianguloEquilatero(Double lado1, Double altura) {
		super(lado1, lado1, lado1, altura);
	}
	
	
	@Override
	public String nombrefigura() {
		return "Triangulo Equilatero";
	}
	
}
