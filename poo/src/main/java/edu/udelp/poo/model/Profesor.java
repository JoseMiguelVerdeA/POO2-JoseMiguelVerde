package edu.udelp.poo.model;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;



public class Profesor extends Persona{
	
	private LocalDate fechaIngreso;
	private List<Materia> materias;

	
	public Profesor() {
		this.materias = new LinkedList<Materia>();
	}
	
	public Profesor(String name, String bDay, String gender) {
		super(name, bDay, gender);
		this.materias = new LinkedList<Materia>();
		this.fechaIngreso = LocalDate.now();
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	public void addMateria(Materia materia) {
		this.materias.add(materia);
	}

	@Override
	public String toString() {
		return "Profesor [Fecha de ingreso: " + fechaIngreso + ", Materias: " + materias + ", Nombre: " + getName()
				+ ", Fecha de nacimiento: " + getbDay() + ", ID: " + getID() + ", Sexo: " + getGender() + "]";
	}

	
}

