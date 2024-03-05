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
				return;
			}
			break;
			
		case 2:
			if(null == pantalonesMezclilla) {
				pantalonesMezclilla = prenda;
				return;
			}
			break;
			
		case 3:
			if(null == camisas) {
				camisas = prenda;
				return;
			}
			break;
			
		case 4:
			if(null == playeras) {
				playeras = prenda;
				return;
			}
			break;
			
		case 5:
			if(null == playeras) {
				playeras = prenda;
				return;
			}
			break;	
			
		case 6:
			if(null == playeras) {
				playeras = prenda;
				return;
			}
			break;
		}
		System.out.println("La prenda no pude ser dada de alta ya que esta ya existe. Prueba agregando articulos al inventario.");
	}

	
	
}
