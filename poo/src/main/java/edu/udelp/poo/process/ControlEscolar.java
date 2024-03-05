package edu.udelp.poo.process;

import java.util.LinkedList;
import java.util.List;

import edu.udelp.poo.model.Carrera;
import edu.udelp.poo.model.Estudiante;
import edu.udelp.poo.model.Materia;
import edu.udelp.poo.model.MateriaAlumno;
import edu.udelp.poo.model.Profesor;


public class ControlEscolar {

	private List<Carrera> carreras;
	private List<Materia> materias;
	private List<Profesor> profesores;
	private List<Estudiante> estudiantes;
	
	
	public ControlEscolar() {
		this.carreras = new LinkedList<Carrera>();
		this.materias = new LinkedList<Materia>();
		this.profesores = new LinkedList<Profesor>();
		this.estudiantes = new LinkedList<Estudiante>();
	}


	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}

	public List<Profesor> getProfesores() {
		return profesores;
	}

	public void setProfesores(List<Profesor> profesores) {
		this.profesores = profesores;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	
	public void agregarCarrera(Carrera carrera) {
		
		if(!carreras.isEmpty()) {
			
			for(int i = 0; i < carreras.size(); i++) {
				
				if(carreras.get(i).getNombre().equals(carrera.getNombre())) {
					
					System.out.println("Esta carrera ya existe.");
					return;
					
				}
			}
		}
		this.carreras.add(carrera);
	}
	
	public void agregarMateria(Materia materia) { 
		
		if(carreras.isEmpty()) {
			
			System.out.println("No se han dado de alta carreras, asegurate de agregar alguna antes de agregar materias.");
			return;
			
		}else if(!materias.isEmpty()) {
			
			for(int i = 0; i < carreras.size(); i++) {
				
				if(carreras.get(i).getNombre().equals(materia.getCarrera().getNombre())) {
					
					for(int j = 0; j < materias.size(); j++) {
						
						if(materias.get(i).getNombre().equals(materia.getNombre())) {
							System.out.println("Esta materia ya existe.");
							return;
						}
					}
					this.materias.add(materia);
					return;
				}
			}
			System.out.println("No se pudo dar de alta la materia ya que no coincide con el ninguna carrera en sistema. Consulta las existentes.");
		}
		
		for(int i = 0; i < carreras.size(); i++) {
			
			if(carreras.get(i).getNombre().equals(materia.getCarrera().getNombre())) {
				
				this.materias.add(materia);
				break;
			}
		}
	}
	
	public void agregarProfesor(Profesor profesor) {
		this.profesores.add(profesor);
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
	}

	public void asignarMateriaProfe(Integer ID, String nombreMateria, String carrera) {
		
		for (int i = 0; i < profesores.size(); i++) {
			
            if(profesores.get(i).getID().equals(ID)) { //pregunta si el id objeto es igual al id ingresado
            	
            	for (int j = 0; j < materias.size(); j++) {
            		
                    if(materias.get(j).getNombre().equals(nombreMateria) && materias.get(j).getCarrera().getNombre().equals(carrera)) { //pregunta si el id objeto es igual al id ingresado
                    	
                    	profesores.get(i).addMateria(materias.get(j));
                    	return;
                    	
                    }
                }
            }
        }
	}
	
	public void asignarCarreraAlumno(Integer ID, String carrera, Integer semestre) { 
		
		for (int i = 0; i < estudiantes.size(); i++) {
			
            if(estudiantes.get(i).getID().equals(ID)) { //pregunta si el id objeto es igual al id ingresado
            	
            	for(int j = 0; j < materias.size(); j++) {
            		
            		if(materias.get(j).getCarrera().getNombre().equals(carrera) && materias.get(j).getSemestre().equals(semestre)) {
            			
            			estudiantes.get(i).addMateria(new MateriaAlumno(materias.get(j).getNombre(), materias.get(j).getCarrera().getNombre(), materias.get(j).getSemestre()));
            			estudiantes.get(i).setCarrera(materias.get(j).getCarrera());
            			estudiantes.get(i).setSemestre(semestre);
            		}
            	}
            	
            }
        }
	}
	
	public void asignarCalificacionPorMateria(Integer ID, String nombreMateria, Integer idCalificacion, Double calificacion) {
		
		for (int i = 0; i < estudiantes.size(); i++) {
			
            if(estudiantes.get(i).getID().equals(ID)) { //pregunta si el id estudiante es igual al id ingresado
            	
            	for(int j = 0; j < estudiantes.get(i).getMaterias().size(); j++) {
            		
            		if(estudiantes.get(i).getMaterias().get(j).getNombre().equals(nombreMateria)) { //pregunta si el id materia es igual al id ingresado
            			
            			switch(idCalificacion) {
            				
	            			case 1:
	            				estudiantes.get(i).getMaterias().get(j).setPrimerParcial(calificacion);
	            				System.out.println("Se le agrego la calificacion de " + estudiantes.get(i).getMaterias().get(j).getPrimerParcial());
	            				break;
	            			case 2:
	            				estudiantes.get(i).getMaterias().get(j).setSegundoParcial(calificacion);
	            				System.out.println("Se le agrego la calificacion de " + estudiantes.get(i).getMaterias().get(j).getSegundoParcial());
	            				break;
	            			case 3:
	            				estudiantes.get(i).getMaterias().get(j).setProyecto(calificacion);;
	            				System.out.println("Se le agrego la calificacion de " + estudiantes.get(i).getMaterias().get(j).getProyecto());
	            				break;
	            			case 4:
	            				estudiantes.get(i).getMaterias().get(j).setExamenFinal(calificacion);;
	            				System.out.println("Se le agrego la calificacion de " + estudiantes.get(i).getMaterias().get(j).getExamenFinal());
	            				break;
            			}
            		}
            	}
            }
        }
	}
	
	public void obtenerDatosAlumno(Integer ID) {
		
		for(int i = 0; i < estudiantes.size(); i++) {
			
			if(estudiantes.get(i).getID().equals(ID)) {
				
				System.out.println(estudiantes.get(i).toString());
				return;
				
			}
		}
	}
	
	public Double obtenerPromedioPorMateriaAlumno(Integer ID, String nombreMateria) throws Exception {
		
		Double promedio=0D;
		
		if(!estudiantes.isEmpty()) {
			for(int i = 0; i < estudiantes.size(); i++) {
				
				if(estudiantes.get(i).getID().equals(ID)) {
					
					if(!estudiantes.get(i).getMaterias().isEmpty()) {
						
						for(int j = 0; j < estudiantes.get(i).getMaterias().size(); j++) {
							
							if(estudiantes.get(i).getMaterias().get(j).getNombre().equals(nombreMateria)) {
								
								if(null == estudiantes.get(i).getMaterias().get(j).getPrimerParcial() || null == estudiantes.get(i).getMaterias().get(j).getSegundoParcial() || null == estudiantes.get(i).getMaterias().get(j).getProyecto() || null == estudiantes.get(i).getMaterias().get(j).getExamenFinal()) {
									throw new Exception("No se puede sacar el promedio de la materia: " 
											+ estudiantes.get(i).getMaterias().get(j) + " ya que el estudiante "
											+ estudiantes.get(i).getName() + " no cuenta con sus 4 calificaciones.");
								}
								
								promedio = (estudiantes.get(i).getMaterias().get(j).getPrimerParcial() 
										+ estudiantes.get(i).getMaterias().get(j).getSegundoParcial() 
										+ estudiantes.get(i).getMaterias().get(j).getProyecto() 
										+ estudiantes.get(i).getMaterias().get(j).getExamenFinal()) / 4;
								return promedio;
								
							}
							
						}
						
					} else {
						throw new Exception("Este alumno no tiene ninguna materia asignada.");
					}
				}
			}
		}
		System.out.println("No hay estudiantes registrados.");
		return null;
		
	}
	
	
	public Double obtenerPromedioPorAlumno(Integer ID) throws Exception{

		Double promedio = 0D;

		if(!estudiantes.isEmpty()) {
			for(int i = 0; i < estudiantes.size(); i++) {

				if(estudiantes.get(i).getID().equals(ID)) {

					if(!estudiantes.get(i).getMaterias().isEmpty()) {
						
						for(int j = 0; j < estudiantes.get(i).getMaterias().size(); j++) {
							
							if(estudiantes.get(i).getMaterias().get(j).getPrimerParcial().equals(null) || estudiantes.get(i).getMaterias().get(j).getSegundoParcial().equals(null) || estudiantes.get(i).getMaterias().get(j).getProyecto().equals(null) || estudiantes.get(i).getMaterias().get(j).getExamenFinal().equals(null)) {
								throw new Exception("No se puede sacar el promedio de la materia: " 
										+ estudiantes.get(i).getMaterias().get(j) + " ya que el estudiante "
										+ estudiantes.get(i).getName() + " no cuenta con sus 4 calificaciones.");
							}
							
							promedio += (estudiantes.get(i).getMaterias().get(j).getPrimerParcial() 
									+ estudiantes.get(i).getMaterias().get(j).getSegundoParcial() 
									+ estudiantes.get(i).getMaterias().get(j).getProyecto() 
									+ estudiantes.get(i).getMaterias().get(j).getExamenFinal()) / 4;
							
						}
						
						return promedio / estudiantes.get(i).getMaterias().size();
					} else {
						throw new Exception("Este alumno no tiene ninguna materia asignada.");
					}				
				}
			}
		}
		System.out.println("No hay estudiantes registrados.");
		return null;
	}
	
	public Double obtenerPromedioDeSemestre(String carrera, Integer semestre) throws Exception{    
		
		Double promedio = 0D, promedioAlumno;
		String cadena = "PROMEDIO DEL SEMESTRE:\n";
		Integer contadorAlumnos = 0;

		if(!estudiantes.isEmpty()) {
			
			for(int i = 0; i < estudiantes.size(); i++) {
				
				if(null != estudiantes.get(i).getCarrera().getNombre() && estudiantes.get(i).getCarrera().getNombre().equals(carrera) && estudiantes.get(i).getSemestre().equals(semestre)) {
					
					promedioAlumno = obtenerPromedioPorAlumno(estudiantes.get(i).getID());
					promedio += promedioAlumno;
					cadena += estudiantes.get(i).getName() 
							+ "\tCarrera: " + estudiantes.get(i).getCarrera() 
							+ "\tSemestre: " + estudiantes.get(i).getSemestre() 
							+ "\tPromedio: " + promedioAlumno + "\n";
					
					contadorAlumnos++;
					
				}
			}
		}		
		System.out.println("No hay estudiantes registrados.");

		
		if(0 != contadorAlumnos) {
			System.out.println(cadena);
			return promedio / contadorAlumnos;
		}
		
		return null;
	}

	public Double obtenerPromedioPorMateria(String carrera, Integer semestre, String nombreMateria) throws Exception {

		Double sumatoria = 0D;
		Double promedio;
		String cadena = "PROMEDIO DE LA MATERIA:\n";
		Integer contadorAlumnos = 0;

		if(!estudiantes.isEmpty()) {
			
			for(int i = 0; i < estudiantes.size(); i++) {

				if(null != estudiantes.get(i).getCarrera().getNombre() && estudiantes.get(i).getCarrera().getNombre().equals(carrera) && estudiantes.get(i).getSemestre().equals(semestre)) {

					for(int j = 0; j < estudiantes.get(i).getMaterias().size(); j++) {

						if(estudiantes.get(i).getMaterias().get(j).getNombre().equals(nombreMateria)) {

							if(estudiantes.get(i).getMaterias().get(j).getPrimerParcial().equals(null) || estudiantes.get(i).getMaterias().get(j).getSegundoParcial().equals(null) || estudiantes.get(i).getMaterias().get(j).getProyecto().equals(null) || estudiantes.get(i).getMaterias().get(j).getExamenFinal().equals(null)) {
								throw new Exception("No se puede sacar el promedio de la materia: " 
										+ estudiantes.get(i).getMaterias().get(j) + " ya que el estudiante "
										+ estudiantes.get(i).getName() + " no cuenta con sus 4 calificaciones.");
							}
							
							sumatoria += (estudiantes.get(i).getMaterias().get(j).getPrimerParcial() 
									+ estudiantes.get(i).getMaterias().get(j).getSegundoParcial() 
									+ estudiantes.get(i).getMaterias().get(j).getProyecto() 
									+ estudiantes.get(i).getMaterias().get(j).getExamenFinal()) / 4;
							
							promedio = sumatoria;
						
							cadena += estudiantes.get(i).getName() 
									+ "\tCarrera: " + estudiantes.get(i).getCarrera() 
									+ "\tSemestre: " + estudiantes.get(i).getSemestre() 
									+ "\tPromedio: " + promedio + "\n";
							
							contadorAlumnos++;
							
							break;
							
						}

					}

				}
			}
		}
		System.out.println("No hay estudiantes registrados.");
		
		if(0 != contadorAlumnos) {
			System.out.println(cadena);
			return sumatoria / contadorAlumnos;
		}

		return null;
	}
	
	public Double obtenerPromedioPorCarrera(String carrera) throws Exception {
		
		Double sumatoria = 0D;
		Double promedio = 0D, promedioAlumno;
		String cadena = "PROMEDIO DE LA CARRERA:\n";
		Integer contadorAlumnos = 0;

		for(int i = 0; i < estudiantes.size(); i++) {
			
			if(null != estudiantes.get(i).getCarrera().getNombre() && estudiantes.get(i).getCarrera().getNombre().equals(carrera)) {
				
				promedioAlumno = obtenerPromedioPorAlumno(estudiantes.get(i).getID());
				promedio += promedioAlumno;
				cadena += estudiantes.get(i).getName() 
						+ "\tCarrera: " + estudiantes.get(i).getCarrera() 
						+ "\tSemestre: " + estudiantes.get(i).getSemestre() 
						+ "\tPromedio: " + promedioAlumno + "\n";
				
				contadorAlumnos++;
				
			}
		}
		
		if(0 != contadorAlumnos) {
			System.out.println(cadena);
			return sumatoria / contadorAlumnos;
		}
		
		return null;
		
	}


	public String obtenerA() {
		String cadena = "";
		
		if(!estudiantes.isEmpty()) {
			
			for(int i = 0; i < estudiantes.size(); i++) {
				
				cadena += estudiantes.get(i).toString() + "\n";
			}
			return cadena;
			
		}
		return "No hay nadie registrado";
	}
	
	public String obtenerP() {
		String cadena = "";
		
		if(!profesores.isEmpty()) {
			
			for(int i = 0; i < profesores.size(); i++) {
				
				cadena += profesores.get(i).toString() + "\n";
			}
			return cadena;
			
		}
		return "No hay nadie registrado";
	}
	
	
}

