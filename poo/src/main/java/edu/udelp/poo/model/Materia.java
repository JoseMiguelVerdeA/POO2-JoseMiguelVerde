package edu.udelp.poo.model;

import java.util.Objects;

public class Materia {

	private Integer semestre;
	private String horario;
	private String nombre;
	private Carrera carrera;
	
	public Materia(String nombre, String carrera, Integer semestre) {
		this.nombre = nombre;
		this.carrera = new Carrera(carrera);
		this.semestre = semestre;
	}
	
	public Materia() {
		
	}
	
	
	public Integer getSemestre() {
		return semestre;
	}
	public void setSemestre(Integer semestre) {
		this.semestre = semestre;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Carrera getCarrera() {
		return carrera;
	}
	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carrera, nombre, semestre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		return Objects.equals(carrera, other.carrera) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(semestre, other.semestre);
	}

	@Override
	public String toString() {
		return "Materia [semestre=" + semestre + ", nombre=" + nombre + ", carrera=" + carrera + "]";
	}
	
	
}

