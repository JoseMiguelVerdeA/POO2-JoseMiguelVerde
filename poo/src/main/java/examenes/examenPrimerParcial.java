package examenes;

import java.util.LinkedList;
import java.util.Scanner;

import edu.udelp.poo.model.Prenda;
import edu.udelp.poo.model.PrendasHombre;
import edu.udelp.poo.model.PrendasMujer;

public class examenPrimerParcial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		PrendasHombre hombre = new PrendasHombre();
		PrendasMujer mujer = new PrendasMujer();
		String nombre, gender, bdate;
        int opcion, opcionGenero, opcionAlta, cantidad1, cantidad2, cantidad3, cantidad4;
        double weight, height, precio;
        
        
        do {
        	
            System.out.println("1. Dar de alta prendas\n2. Mostrar tabla con todas las prendas\n"
            		+ "3. Vender\n4. Ver tabla de ventas");
            opcion = scanner.nextInt();
            
            switch (opcion) {
            
	            case 1:
	            	System.out.println("Ingrese '1' si la prenda pertenece a hombre y '2' si pertenece a mujer: ");
	            	opcionGenero = scanner.nextInt();
	            	
                    System.out.println("Ingrese la opcion correspondiente a la prenda que quiere dar de alta: ");
                    opcionAlta = scanner.nextInt();
                    
                    System.out.println("Ingrese el precio de compra del producto: ");
                    precio = scanner.nextInt();
                    
                    System.out.println("Ingrese la cantidad de tallas CH: ");
                    cantidad1 = scanner.nextInt();
                    
                    System.out.println("Ingrese la cantidad de tallas M: ");
                    cantidad2 = scanner.nextInt();
                    
                    System.out.println("Ingrese la cantidad de tallas G: ");
                    cantidad3 = scanner.nextInt();
                    
                    System.out.println("Ingrese la cantidad de tallas XG: ");
                    cantidad4 = scanner.nextInt();
                    
                    if(opcionGenero==1) {
                    	hombre.altaPrenda(new Prenda(precio, cantidad1, cantidad2, cantidad3, cantidad4), opcionAlta);
                    } else if(opcionGenero==2) {
                    	mujer.altaPrenda(new Prenda(precio, cantidad1, cantidad2, cantidad3, cantidad4), opcionAlta);
                    }
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

}
