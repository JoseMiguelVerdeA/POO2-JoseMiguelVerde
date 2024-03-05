package edu.udelp.poo.model;

import java.util.LinkedList;
import java.util.List;


public class Estudiante extends Persona{

	private Integer semestre;
	private List<MateriaAlumno> materias;
	private String generacion;
	private Carrera carrera;
	
	public Estudiante() {
		this.materias = new LinkedList<MateriaAlumno>();
	}
	
	public Estudiante(String name, String bDay, String gender) {
		super(name,bDay,gender);
		this.materias = new LinkedList<MateriaAlumno>();
	}

	public Integer getSemestre() {
		return semestre;
	}

	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}

	public List<MateriaAlumno> getMaterias() {
		return materias;
	}

	public void setMaterias(List<MateriaAlumno> materias) {
		this.materias = materias;
	}
	
	public void addMateria(MateriaAlumno materia) {
		this.materias.add(materia);
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carera) {
		this.carrera = carera;
	}

	@Override
	public String toString() {
		return "Estudiante [Semestre: " + semestre + ", Carrera: " + carrera + ", Nombre: " + getName() + ", Fecha de nacimiento: "
				+ getbDay() + ", ID: " + getID() + ", Sexo: " + getGender() + "]";
	}

	

	
	
	
}

