package tareas;

import java.util.Scanner;

import edu.udelp.poo.model.Carrera;
import edu.udelp.poo.model.Estudiante;
import edu.udelp.poo.model.Materia;
import edu.udelp.poo.model.Profesor;
import edu.udelp.poo.process.ControlEscolar;
import edu.udelp.poo.process.Validaciones;



public class CentroEscolarMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		ControlEscolar control = new ControlEscolar();
		Validaciones valida = new Validaciones();
		String nombre, nombre2, gender, bdate, materia, carrera;
		Integer semestre, id, idCalificacion;
		Double calificacion;
        int option;
       
        do {
        	
            System.out.println("1. Dar de alta carreras\n2. Dar de alta materias\n3. Dar de alta profesores\n4. Dar de alta alumnos\n5. Asignar materia a profesor\n6. Asignar carrera a los alumnos\n7. Asignar calificaciones a los alumnos por materia\n8. Obtener datos del alumno\n9. Obtener el promedio por materia\n10. Obtener el promedio por alumno\n11. Obtener el promedio del semestre del alumno\n12. Obtener el promedio por materia\n13. Obtener el promedio por carrera\n14. Obtener datos de alumnos\n15. Obtener datos de profesores\n16. Salir\n\nSeleccione una opcion:\n");
            option = valida.isNumber(scanner.next());
            
            switch (option) {
            
	            case 1:
	            	System.out.println("Escribe el nombre de la carrera que deseas agregar al sistema: ");
	            	nombre = scanner.next();
	            	scanner.nextLine();
	            	if(valida.contieneNumeros(nombre)) {
	            		System.out.println("Los nombres de materias y/o carreras van sin numeros");
	            		break;
	            	}
	            	control.agregarCarrera(new Carrera(nombre.toUpperCase()));
                    break;
                    
                case 2:
                	System.out.println("Escribe el nombre de la materia que deseas agregar al sistema: ");
	            	nombre = scanner.next();
	            	System.out.println("Escribe el nombre de la carrera a la que se le asignara: ");
	            	nombre2 = scanner.next();
	            	System.out.println("Escribe el semestre al que pertenece la materia(1-8): ");
	            	semestre = valida.isNumber(scanner.next());
	            	
	            	if(valida.contieneNumeros(nombre) || valida.contieneNumeros(nombre2)) {
	            		
	            		System.out.println("Los nombres de materias y/o carreras van sin numeros");
	            		break;
	            		
	            	} else if(-1 == semestre || !(semestre >= 1 && semestre <=8)) {
	            		
	            		System.out.println("Ingresa un numero entre 1 y 8");
	            		break;
	            		
	            	}
	            	
	            	control.agregarMateria(new Materia(nombre.toUpperCase(), nombre2.toUpperCase(), semestre));
                    break;
                    
                case 3:
                	System.out.println("Escribe el nombre del profesor que deseas ingresar al sistema: ");
	            	nombre = scanner.next();
	            	
	            	if(valida.contieneNumeros(nombre)) {
	            		
	            		System.out.println("Escribe el nombre sin numeros.");
	            		break;
	            		
	            	}
	            	
	            	System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy): ");
	            	bdate = scanner.next();
	            	
                    if(valida.isValidDate(bdate)==false) {
                    	
                    	System.out.println("Ingresa una fecha valida.");
                    	break;
                    	
                    }
                    
                    System.out.println("Ingrese el sexo (H/M): ");
                    gender = scanner.next();
                    control.agregarProfesor(new Profesor(nombre.toUpperCase(),bdate, gender.toUpperCase()));
                    break;
                    
                case 4:
                	System.out.println("Escribe el nombre del estudiante que deseas ingresar al sistema: ");
	            	nombre = scanner.next();
	            	
	            	if(valida.contieneNumeros(nombre)) {
	            		
	            		System.out.println("Escribe el nombre sin numeros.");
	            		break;
	            		
	            	}
	            	
	            	System.out.println("Ingrese su fecha de nacimiento(dd/MM/yyyy): ");
	            	bdate = scanner.next();
	            	
                    if(valida.isValidDate(bdate)==false) {
                    	
                    	System.out.println("Ingresa una fecha valida.");
                    	break;
                    	
                    }
                    
                    System.out.println("Ingrese el sexo (H/M): ");
                    gender = scanner.next();
                    control.agregarEstudiante(new Estudiante(nombre.toUpperCase(),bdate, gender.toUpperCase()));
                    break;
                    
                case 5:
                	System.out.println("Ingresa el ID del profesor al que deseas asignar la materia: ");
                	id = valida.isNumber(scanner.next());
                	System.out.println("Escribe el nombre de la materia: ");
                	materia = scanner.next();
                	System.out.println("Escribe la carrera a la que pertenece dicha materia: ");
                	carrera = scanner.next();
                	
                	if(valida.contieneNumeros(carrera) || valida.contieneNumeros(materia)) {

                		System.out.println("Los nombres de materias y/o carreras van sin numeros");
                		break;
	            		
	            	} else if(-1 == id || !(id >= 10000000 && id <=99999999)) {
	            		
	            		System.out.println("Ingresa un ID valido.");
	            		break;
	            		
	            	}
                	
                	control.asignarMateriaProfe(id, materia.toUpperCase(), carrera.toUpperCase());
                    break;
                    
                case 6:
                	System.out.println("Ingresa el ID del estudiante al que deseas asignarle una carrera: ");
                	id = valida.isNumber(scanner.next());
                	System.out.println("Escribe la carrera a asignar: ");
                	carrera = scanner.next();
                	System.out.println("Escribe el semestre (1-8) al que ingresara: ");
                	semestre = valida.isNumber(scanner.next());
                	
                	if(valida.contieneNumeros(carrera)) {

                		System.out.println("Los nombres de carreras van sin numeros");
                		break;
	            		
	            	} else if(-1 == id || !(id >= 10000000 && id <=99999999)) {
	            		
	            		System.out.println("Ingresa un ID valido.");
	            		break;
	            		
	            	}else if(-1 == semestre || !(semestre >= 1 && semestre <=8)) {

                		System.out.println("El semestre ingresado debe ser un numero entre 1 y 8");
                		break;

                	}
                	
                	control.asignarCarreraAlumno(id, carrera.toUpperCase(), semestre);
                    break;
                case 7:
                	System.out.println("Ingresa el ID del estudiante al que deseas agregarle una calificacion: ");
                	id = valida.isNumber(scanner.next());
                	System.out.println("Escribe el nombre de la materia: ");
                	materia = scanner.next();
                	System.out.println("Escoge una de las opciones siguientes (1.-Primer parcial, 2.-Segundo parcial, 3.-Proyecto final, 4.-Examen final):");
                	idCalificacion = valida.isNumber(scanner.next());
                	System.out.println("Ingresa la calificacion 0-10: ");
                	calificacion = valida.isNumberD(scanner.next());
                	
                	if(valida.contieneNumeros(materia)) {

                		System.out.println("Los nombres de materias van sin numeros");
                		break;
	            		
	            	} else if(-1 == id || !(id >= 10000000 && id <=99999999)) {
	            		
	            		System.out.println("Ingresa un ID valido.");
	            		break;
	            		
	            	} else if(-1 == idCalificacion || !(idCalificacion >= 1 && idCalificacion <=4)) {
	            		
	            		System.out.println("Opcion invalida.");
	            		break;
	            		
	            	} else if(-1 == calificacion || !(calificacion >= 0 && calificacion <=10)) {
	            		
	            		System.out.println("Calificacion invalida.");
	            		break;
	            		
	            	}
                	
                	control.asignarCalificacionPorMateria(id, materia.toUpperCase(), idCalificacion, calificacion);
                    break;
                    
                case 8:
                	if(!control.getEstudiantes().isEmpty()) {
                		System.out.println("Ingresa el ID del estudiante del cual deseas consultar los datos: ");
                    	id = valida.isNumber(scanner.next());
                    	if(-1 == id || !(id >= 10000000 && id <=99999999)) {
                    		System.out.println("Ingresa un ID valido.");
    	            		break;
                    	}
                    	control.obtenerDatosAlumno(id);
                	}else {
                		System.out.println("No hay ningun estudiante registrado.");
                	}
                    break;
                    
                case 9:
                	System.out.println("Ingresa el ID del alumno: ");
                	id = valida.isNumber(scanner.next());
                	System.out.println("Ingresa el nombre de la materia: ");
                	materia = scanner.next();
                	if(valida.contieneNumeros(materia)) {

                		System.out.println("Los nombres de materias van sin numeros");
                		break;
	            		
	            	} else if(-1 == id || !(id >= 10000000 && id <=99999999)) {
	            		
	            		System.out.println("Ingresa un ID valido.");
	            		break;
	            		
	            	}
                	
                	System.out.println("El promedio del alumno en la materia " + materia.toUpperCase() + " es: " + control.obtenerPromedioPorMateriaAlumno(id, materia.toUpperCase()));
                    break;
                    
                case 10:
                	System.out.println("Ingresa el ID del alumno: ");
                	id = valida.isNumber(scanner.next());
                	
                	if(-1 == id || !(id >= 10000000 && id <=99999999)) {

                		System.out.println("Ingresa un ID valido.");
                		break;

                	}
                	
                	System.out.println("El promedio del alumno en el semestre corriente es de: " + control.obtenerPromedioPorAlumno(id));
                    break;
                    
                case 11:
                	System.out.println("Ingresa el nombre de la carrera: ");
                	carrera = scanner.next();
                	System.out.println("Escribe el semestre 1-8: ");
                	semestre = valida.isNumber(scanner.next());
                	
                	if(valida.contieneNumeros(carrera)) {

                		System.out.println("Los nombres de carreras van sin numeros");
                		break;

                	} else if(-1 == semestre || !(semestre >= 1 && semestre <=8)) {

                		System.out.println("Ingresa un numero entre 1 y 8");
                		break;

                	}
                	
                	control.obtenerPromedioDeSemestre(carrera.toUpperCase(), semestre);
                    break;
                    
                case 12:
                	System.out.println("Ingresa el nombre de la carrera: ");
                	carrera = scanner.next();
                	System.out.println("Ingresa el semestre 1-8: ");
                	semestre = valida.isNumber(scanner.next());
                	System.out.println("Ingresa el nombre de la materia: ");
                	materia = scanner.next();
                	if(valida.contieneNumeros(carrera) || valida.contieneNumeros(materia)) {

                		System.out.println("Los nombres de carreras/materias van sin numeros");
                		break;

                	} else if(-1 == semestre || !(semestre >= 1 && semestre <=8)) {

                		System.out.println("Ingresa un numero entre 1 y 8");
                		break;

                	}
                	control.obtenerPromedioPorMateria(carrera, semestre, materia);
                    break;
                    
                case 13:
                	System.out.println("Ingresa el nombre de la carrera: ");
                	carrera = scanner.next();
                	
                	if(valida.contieneNumeros(carrera)) {

                		System.out.println("Los nombres de carreras van sin numeros");
                		break;

                	}
                	
                	control.obtenerPromedioPorCarrera(carrera);
                	break;
                	
                case 14:
                	System.out.println(control.obtenerA());
                	break;
                	
                case 15:
                	System.out.println(control.obtenerP());
                	break;
                	
                case 16:
                    System.out.println("Ha salido del programa");
                    break;
                    
                default:
                    System.out.println("Opción no válida.");
                    break;
                    
            }
            
        } while (option != 16);
	}

}
