package edu.udelp.poo.model;

public class Cuenta {

	private String titular;
	private Double cantidad;
	
	public Cuenta() {
		this.cantidad=0D;
	}
	
	public Cuenta(String titular) {
		this.titular=titular;
		this.cantidad=0D;
	}
	
	public Cuenta(String titular, Double cantidad) {
		this.titular=titular;
		this.cantidad=cantidad;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String toString() {
		return "Cuenta: ('titular': " + titular + ", 'cantidad': " + cantidad + ")";
	}
}
