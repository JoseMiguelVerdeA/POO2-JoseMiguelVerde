package examenes;

import java.util.Scanner;

import edu.udelp.poo.model.Prenda;
import edu.udelp.poo.model.PrendasHombre;
import edu.udelp.poo.model.PrendasMujer;
import edu.udelp.poo.process.Validaciones;

public class examenPrimerParcial {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		PrendasHombre hombre = new PrendasHombre();
		PrendasMujer mujer = new PrendasMujer();
		Validaciones valida = new Validaciones();
        int opcion, opcionGenero, opcionAlta, cantidad1, cantidad2, cantidad3, cantidad4;
        double precio;
        
        
        do {
        	
            System.out.println("1. Dar de alta prendas\n2. Mostrar tabla con todas las prendas\n"
            		+ "3. Vender\n4. Ver tabla de ventas\n5. Re-stock\n6. Salir");
            opcion = valida.isNumber(scanner.next());
            
            switch (opcion) {
            
	            case 1:
	            	System.out.println("Ingrese '1' si la prenda pertenece a hombre y '2' si pertenece a mujer: ");
	            	opcionGenero = valida.isNumber(scanner.next());
	            	
                    System.out.println("Ingrese la opcion correspondiente a la prenda que quiere dar de alta: \n1. Pantalon de vestir\n2. Pantalon de mezclilla\n3. Camisa\n4.Playera" + (opcionGenero==2?"\n5. Blusa\n6. Falda":""));
                    opcionAlta = valida.isNumber(scanner.next());
                    
                    System.out.println("Ingrese el precio de compra del producto: ");
                    precio = valida.isNumberD(scanner.next());
                    
                    System.out.println("Ingrese la cantidad de tallas CH: ");
                    cantidad1 = valida.isNumber(scanner.next());
                    
                    System.out.println("Ingrese la cantidad de tallas M: ");
                    cantidad2 = valida.isNumber(scanner.next());
                    
                    System.out.println("Ingrese la cantidad de tallas G: ");
                    cantidad3 = valida.isNumber(scanner.next());
                    
                    System.out.println("Ingrese la cantidad de tallas XG: ");
                    cantidad4 = valida.isNumber(scanner.next());
                    
                    if(opcionGenero==1 && cantidad1>=0 && cantidad2>=0 && cantidad3>=0 && cantidad4>=0 && precio>=0 && opcionAlta>=1 && opcionAlta<=4) {
                    	hombre.altaPrenda(new Prenda(precio, cantidad1, cantidad2, cantidad3, cantidad4), opcionAlta);
                    } else if(opcionGenero==2 && cantidad1>=0 && cantidad2>=0 && cantidad3>=0 && cantidad4>=0 && precio>=0 && opcionAlta>=1 && opcionAlta<=6) {
                    	mujer.altaPrenda(new Prenda(precio, cantidad1, cantidad2, cantidad3, cantidad4), opcionAlta);
                    }
                    break;
                    
                case 2:
                	if(hombre.getPantalonesMezclilla()!=null || hombre.getPantalonesVestir()!=null || hombre.getCamisas()!=null ||hombre.getPlayeras()!=null || mujer.getPantalonesMezclilla()!=null || mujer.getPantalonesVestir()!=null || mujer.getCamisas()!=null || mujer.getPlayeras()!=null || mujer.getBlusas()!=null || mujer.getFaldas()!=null) {
                		System.out.println("Hombre:\n"+hombre.tPrendas()+"\nMujer:\n"+mujer.tPrendas()+"\n");
                		break;
                	}
                    System.out.println("No se han dado de alta prendas.");
                    break;
                    
                case 3:
                	if(hombre.getPantalonesMezclilla()!=null || hombre.getPantalonesVestir()!=null || hombre.getCamisas()!=null ||hombre.getPlayeras()!=null || mujer.getPantalonesMezclilla()!=null || mujer.getPantalonesVestir()!=null || mujer.getCamisas()!=null || mujer.getPlayeras()!=null || mujer.getBlusas()!=null || mujer.getFaldas()!=null) {
                		Double total = 0D;
                		Double costo;
                		do {
                			System.out.println("Ingresa '1' si la prenda que deseas comprar es de hombre o '2' si es de mujer");
                			switch(scanner.nextInt()) {
                			case 1:
                				System.out.println("1. Pantalon de vestir\n2. Pantalon de mezclilla\n3. Camisa\n4. Playera");
                				Integer prenda = scanner.nextInt();
                				System.out.println("1. Talla CH\n2. Talla M\n3. Talla G\n4. Talla XG");
                				Integer talla = scanner.nextInt();
                				System.out.println("Cantidad");
                				Integer cantidad = scanner.nextInt();
                				if(cantidad>=1) {
                					for(int i=1; i<=cantidad; i++) {
                						costo = hombre.venta(prenda, talla);
                						if(null == costo) {
                							System.out.println("No hay suficientes prendas.");
                							break;
                						}
                						total += costo;
                					}
                					System.out.println("Total actual: " + total);
                					break;
                				}
                				System.out.println("ingresa una cantidad entera mayor a 0");
                			case 2:
                				System.out.println("1. Pantalon de vestir\n2. Pantalon de mezclilla\n3. Camisa\n4. Playera\n5. Blusa\n6. Falda");
                				Integer prendaM = scanner.nextInt();
                				System.out.println("1. Talla CH\n2. Talla M\n3. Talla G\n4. Talla XG");
                				Integer tallaM = scanner.nextInt();
                				System.out.println("Cantidad");
                				Integer cantidadM = scanner.nextInt();
                				if(cantidadM>=1) {
                					for(int i=1; i<=cantidadM; i++) {
                						costo = mujer.venta(prendaM, tallaM);
                						if(null == costo) {
                							System.out.println("No hay suficientes prendas.");
                							break;
                						}
                						total += costo;
                					}
                					System.out.println("Total actual: " + total);
                					break;
                				}
                				System.out.println("ingresa una cantidad entera mayor a 0");
                			default:
                				System.out.println("Opcion invalida.");
                			}
                			
                			System.out.println("Deseas seguir comprando? 1. Si  /  Otro numero. No");
                		}while(scanner.nextInt()==1?true:false);
                		break;
                	}else {
                		System.out.println("No se han dado de alta prendas\n");
                		break;
                	}
                    
                 
                case 4:
                	if(!hombre.getVentas().isEmpty() ) {
                		System.out.println("Hombre:\n"+hombre.getVentas());
                	} else {
                		System.out.println("No se ha vendido nada de hombre.");
                	}
                	if(!mujer.getVentas().isEmpty()) {
                		System.out.println("\nMujer:\n"+mujer.getVentas()+"\n");
                	} else {
                		System.out.println("No se ha vendido nada de mujer.");
                	}
                    break;
                    
                case 5:
                	System.out.println("Ingresa '1' si la prenda a la que quieres hacerle re-stock es de hombre o '2' si es de mujer");
                	switch(scanner.nextInt()) {
        			case 1:
        				System.out.println("1. Pantalon de vestir\n2. Pantalon de mezclilla\n3. Camisa\n4. Playera");
        				Integer prenda = scanner.nextInt();
        				
        				System.out.println("Ingrese la cantidad de tallas CH: ");
                        cantidad1 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas M: ");
                        cantidad2 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas G: ");
                        cantidad3 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas XG: ");
                        cantidad4 = valida.isNumber(scanner.next());
                        
                        hombre.anadirAInventario(prenda, cantidad1, cantidad2, cantidad3, cantidad4);
                        break;
        				
        			case 2:
        				System.out.println("1. Pantalon de vestir\n2. Pantalon de mezclilla\n3. Camisa\n4. Playera\n5. Blusa\6. Falda");
        				Integer prendaM = scanner.nextInt();
        				
        				System.out.println("Ingrese la cantidad de tallas CH: ");
                        cantidad1 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas M: ");
                        cantidad2 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas G: ");
                        cantidad3 = valida.isNumber(scanner.next());
                        
                        System.out.println("Ingrese la cantidad de tallas XG: ");
                        cantidad4 = valida.isNumber(scanner.next());
                        
                        mujer.anadirAInventario(prendaM, cantidad1, cantidad2, cantidad3, cantidad4);
                        break;
                	}
                    
                    break;
                case 6:
                    System.out.println("Ha salido del programa");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
                    break;
                    
            }
            
        } while (opcion != 6);
    
	}

}
