package tareas;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Scanner;

import edu.udelp.poo.model.Persona;


public class PersonaMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String nombre, gender, bdate;
        int option;
        double weight, height;
        LinkedList<Persona> list = new LinkedList<>();
        Persona persona;
        
        do {
        	
            System.out.println("1. Crear nueva persona\n2. Ver información general de todas las personas ingresadas\n"
            		+ "3. Ver información de una persona(IMC, edad, mayor de edad)\n4. Salir\nSeleccione una opción:");
            option = scanner.nextInt();
            
            switch (option) {
            
	            case 1:
	            	System.out.println("Ingrese el nombre: ");
	            	nombre = scanner.next();
	            	
	            	scanner.nextLine();
                    System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy): ");
                    bdate = scanner.next();
                    if(isValidDate(bdate)==false) {
                    	System.out.println("Ingresa una fecha valida.");
                    	break;
                    }
                    System.out.println("Ingrese el sexo (H/M): ");
                    gender = scanner.next();
                    System.out.println("Ingrese su peso en kilogramos: ");
                    weight = isNumber(scanner.next());
                    if(weight==-1) {
                    	System.out.println("Ingresa una peso valido.");
                    	break;
                    }
                    System.out.println("Ingrese su estatura en metros: ");
                    height = isNumber(scanner.next());
                    if(height==-1) {
                    	System.out.println("Ingresa una estarura valida.");
                    	break;
                    }
                    list.add(new Persona(nombre, bdate, gender, weight, height));
                    break;
                    
                case 2:
                	if(list.isEmpty()) {
                		System.out.println("No se ha ingresado ninguna persona a la lista.\n");
                		break;
                	}
                    System.out.println(list);
                    break;
                    
                case 3:
                	if(list.isEmpty()) {
                		System.out.println("No se ha ingresado ninguna persona a la lista.\n");
                		break;
                	}
                    System.out.println(list);
                    System.out.println("Ingresa el ID de quien quieres ver sus otros datos:");
                    persona = buscarPersona(list, scanner.nextInt());
                    System.out.println("Nombre: " + persona.getName() + " ID: " + persona.getID() + 
                    		" IMC: " + persona.calcularIMC() + " Edad: " + persona.calcularEdad() + 
                    		" Mayor de edad: " + persona.esMayorDeEdad());
                    break;
                    
                case 4:
                    System.out.println("Ha salido del programa");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
                    break;
                    
            }
            
        } while (option != 4);
    
	}

	
	public static boolean isValidDate(String d) {
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
	
	public static double isNumber(String number) {
		try {
			Double.parseDouble(number);
		} catch(Exception e) {
			System.out.println("El dato ingresado no es un numero.");
			return -1;
		}
		return Double.parseDouble(number);
	}
	
	public static Persona buscarPersona(LinkedList<Persona> list, Integer ID) {
		for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getID().equals(ID)) {
            	return list.get(i);
            }
        }
		return null;
	}
	
}
