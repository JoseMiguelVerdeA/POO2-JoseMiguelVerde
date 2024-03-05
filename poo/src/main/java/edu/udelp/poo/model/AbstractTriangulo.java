package edu.udelp.poo.model;

public abstract class AbstractTriangulo implements Figura{

	protected Double lado1;
	protected Double lado2;
	protected Double base;
	protected Double altura;
	
	private final Integer numLados = 3;
	
	
	public AbstractTriangulo(Double lado1, Double lado2, Double base, Double altura) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base = base;
		this.altura = altura;
	}
	
	public abstract String nombrefigura();
	
	public void getResultados() {
		
		System.out.println("La figura: " + nombrefigura());
		System.out.println("Lados: " + numLados);
		System.out.println("Perimetro: " + perimetro());
		System.out.println("Area: " + area());
		
	}
	
	@Override
	public Double perimetro() {
		return (lado1 + lado2 + base + altura);
	}
	
	@Override
	public Double area() {
		return (base * altura) / 2;
	}
}
