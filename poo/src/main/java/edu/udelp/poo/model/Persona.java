package edu.udelp.poo.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;

import lombok.Data;

@Data
public class Persona {

	private String name;
	private LocalDate bDay;
	private Integer ID;
	private String gender; 
	private Double weight;
	private Double height;
	
	public Persona() {
		
	}
	
	public Persona(String name, String bDay, String gender) {
		this.name = name;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //dia, mes y ano
		this.bDay = LocalDate.parse(bDay, format);
		this.gender = gender;
		this.ID=generarId();
	}
	
	public Persona(String name, String bDay, String gender, Double weight, Double height) { //nombre, fecha de nacimiento, sexo, peso y altura
		
		this.name = name;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //dia, mes y ano
		this.bDay = LocalDate.parse(bDay, format);
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.ID=generarId();
		
	}
	
	public Persona(String name, String bDay, String gender, Double weight, Double height, Integer ID) { //nombre, fecha de nacimiento, sexo, peso, altura y ID

		this.name = name;
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //dia, mes y ano
		this.bDay = LocalDate.parse(bDay, format);
		this.gender = gender;
		this.weight = weight;
		this.height = height;
		this.ID = ID;
		
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getbDay() {
		return bDay;
	}

	public void setbDay(LocalDate bDay) {
		this.bDay = bDay;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	
	// - - - - - - - - - - - - - - - - - - - - - - -
	
	
	private int generarId() {
		
		Random random = new Random();
		return random.nextInt(99999999)+10000000;
		
	}
	
	public int calcularIMC() throws Exception {
		
		if((null == weight || null == height) || ((weight < 0 || height < 0))) {throw new Exception("El peso o la altura no pueden ser nulo/negativo");}
		
		double IMC = (weight/(Math.pow(height, 2)));
		
		if(IMC < 20) {
			
			return -1; //debajo de su peso
			
		} else if(IMC >= 20 && IMC <=25) {
			
			return 0; //en su peso ideal
			
		}
		
		return 1; //sobre peso
		
	}
	
	public int calcularEdad() {
		
		LocalDate actualDate = LocalDate.now();
		Period period = Period.between(bDay, actualDate);
		
		return period.getYears();	
		
	}
	
	public boolean esMayorDeEdad() {
		
		return (calcularEdad()>=18);
		
	}
	
	@Override
	public String toString() {
		return "Persona: ('nombre': " + name + ", 'fecha de nacimiento': " + bDay.toString() 
		+ ", 'ID': " + ID + ", 'sexo': " + gender + ", 'peso': " 
				+ weight + ", 'altura': " + height + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(ID, other.ID);
	}
	
	
} 

