package edu.udelp.poo.process;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;

import edu.udelp.poo.model.Persona;


public class Validaciones {

	public boolean isValidDate(String d) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			LocalDate date = LocalDate.parse(d, format);
			LocalDate actualDate = LocalDate.now();
			Period period = Period.between(date, actualDate);
			if(period.getYears() < 0 || period.getMonths() < 0 || period.getDays() < 0) {
				return false;
			}
		} catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public Double isNumberD(String number) {
		try {
			Double.parseDouble(number);
		} catch(Exception e) {
			System.out.println("El dato ingresado no es un numero.");
			return -1D;
		}
		return Double.parseDouble(number);
	}
	
	public int isNumber(String number) {
		try {
			Integer.parseInt(number);
		} catch(Exception e) {
			System.out.println("El dato ingresado no es un numero.");
			return -1;
		}
		return Integer.parseInt(number);
	}
	
	public Persona buscarPersona(LinkedList<Persona> list, Integer ID) {
		for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getID().equals(ID)) {
            	return list.get(i);
            }
        }
		return null;
	}
	
	public boolean contieneNumeros(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
