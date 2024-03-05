package edu.udelp.poo.model;

import lombok.Data;

@Data
public class PrendasMujer extends PrendasHombre{
	
	private Prenda blusas;
	private Prenda faldas;
	
	
	public PrendasMujer() {
		
	}

	@Override
	public void altaPrenda(Prenda prenda, Integer opcion) {
		switch(opcion) {
		case 1:
			if(null == pantalonesVestir) {
				pantalonesVestir = prenda;
				pantalonesVestir.setNombre("Pantalon de vestir");
				return;
			}
			break;
			
		case 2:
			if(null == pantalonesMezclilla) {
				pantalonesMezclilla = prenda;
				pantalonesMezclilla.setNombre("Pantalon de mezclilla");
				return;
			}
			break;
			
		case 3:
			if(null == camisas) {
				camisas = prenda;
				camisas.setNombre("Camisa");
				return;
			}
			break;
			
		case 4:
			if(null == playeras) {
				playeras = prenda;
				playeras.setNombre("Playera");
				return;
			}
			break;
			
		case 5:
			if(null == blusas) {
				blusas = prenda;
				blusas.setNombre("Blusa");
				return;
			}
			break;	
			
		case 6:
			if(null == faldas) {
				faldas = prenda;
				faldas.setNombre("Falda");
				return;
			}
			break;
		}
		System.out.println("La prenda no pude ser dada de alta ya que esta ya existe. Prueba agregando articulos al inventario.");
	}

	@Override
	public void anadirAInventario(Integer opcion, Integer cantidadCH, Integer cantidadM, Integer cantidadG, Integer cantidadXG) {
		if(opcion == 5 || opcion == 5) {
			switch(opcion) {
			case 5:
				if(null != pantalonesVestir) {
					pantalonesVestir.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
					return;}
				System.out.println("No se pudo agregar a inventario ya que la prenda no existe.");
				break;
				
			case 6:
				if(null != pantalonesMezclilla) {
					pantalonesMezclilla.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
					return;}
				System.out.println("No se pudo agregar a inventario ya que la prenda no existe.");
				break;
			}
		} else {
			super.anadirAInventario(opcion, cantidadCH, cantidadM, cantidadG, cantidadXG);
		}
	}
	
	//modificar precio
	//modificar venta
	
	@Override
	public String tPrendas() {
		return super.tPrendas() + blusas +"/n"+ faldas +"/n";
	}
	
	
}
