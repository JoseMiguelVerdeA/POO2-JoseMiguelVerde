package edu.udelp.poo.model;


public class MateriaAlumno extends Materia{

	private Double primerParcial;
	private Double segundoParcial;
	private Double proyecto;
	private Double examenFinal;
	
	
	public MateriaAlumno() {
		
	}

	public MateriaAlumno(String nombre, String carrera, Integer semestre) {
		super(nombre, carrera, semestre);
	}
	
	
	public Double getPrimerParcial() {
		return primerParcial;
	}
	public void setPrimerParcial(Double primerParcial) {
		this.primerParcial = primerParcial;
	}
	public Double getSegundoParcial() {
		return segundoParcial;
	}
	public void setSegundoParcial(Double segundoParcial) {
		this.segundoParcial = segundoParcial;
	}
	public Double getProyecto() {
		return proyecto;
	}
	public void setProyecto(Double proyecto) {
		this.proyecto = proyecto;
	}
	public Double getExamenFinal() {
		return examenFinal;
	}
	public void setExamenFinal(Double examenFinal) {
		this.examenFinal = examenFinal;
	}

	
}

