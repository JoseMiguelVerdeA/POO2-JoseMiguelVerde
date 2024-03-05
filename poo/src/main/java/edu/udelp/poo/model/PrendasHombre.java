package edu.udelp.poo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PrendasHombre {
	
	protected Prenda pantalonesVestir;
	protected Prenda pantalonesMezclilla;
	protected Prenda camisas;
	protected Prenda playeras;
	protected List ventas;
	
	
	public PrendasHombre() {
		ventas = new ArrayList();
	}
	
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
		}
		System.out.println("La prenda no pude ser dada de alta ya que esta ya existe.");
	}
	
	public void anadirAInventario(Integer opcion, Integer cantidadCH, Integer cantidadM, Integer cantidadG, Integer cantidadXG) {
		switch(opcion) {
		case 1:
			if(null != pantalonesVestir) {
				pantalonesVestir.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
				return;}
			break;
			
		case 2:
			if(null != pantalonesMezclilla) {
				pantalonesMezclilla.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
				return;}
			break;

		case 3:
			if(null != camisas) {
				camisas.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
				return;}
			break;

		case 4:
			if(null != playeras) {
				playeras.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
				return;}
			break;

		}
		System.out.println("No se pudo agregar a inventario ya que la prenda no existe.");
	}
	
	public void modificarPrecio(Integer opcion, Double precio) {
		switch(opcion) {
		case 1:
			if(null != pantalonesVestir) {
				pantalonesVestir.setPrecioCompra(precio);
				return;}


		case 2:
			if(null != pantalonesMezclilla) {
				pantalonesMezclilla.setPrecioCompra(precio);
				return;}


		case 3:
			if(null != camisas) {
				camisas.setPrecioCompra(precio);
				return;}


		case 4:
			if(null != playeras) {
				playeras.setPrecioCompra(precio);
				return;}


		}
	}
	
	public Double venta(Integer opcion, Integer talla) {

		switch(opcion) {
		case 1:
			if(null != pantalonesVestir) {
				switch(talla) {
				case 1:

					pantalonesVestir.setCantidadCH(pantalonesVestir.getCantidadCH() - 1);
					ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "CH\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioCH());
					return pantalonesVestir.getPrecioCH();


				case 2:

					pantalonesVestir.setCantidadM(pantalonesVestir.getCantidadM() - 1);
					ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "M\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioM());
					return pantalonesVestir.getPrecioM();


				case 3:

					pantalonesVestir.setCantidadG(pantalonesVestir.getCantidadG() - 1);
					ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "G\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioG());
					return pantalonesVestir.getPrecioG();


				case 4:

					pantalonesVestir.setCantidadXG(pantalonesVestir.getCantidadXG() - 1);
					ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "XG\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioXG());
					return pantalonesVestir.getPrecioXG();
				}
			}


		case 2:
			if(null != pantalonesMezclilla) {
				switch(talla) {
				case 1:

					pantalonesMezclilla.setCantidadCH(pantalonesMezclilla.getCantidadCH() - 1);
					ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "CH\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioCH());
					return pantalonesMezclilla.getPrecioCH();


				case 2:

					pantalonesMezclilla.setCantidadM(pantalonesMezclilla.getCantidadM() - 1);
					ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "M\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioM());
					return pantalonesMezclilla.getPrecioM();


				case 3:

					pantalonesMezclilla.setCantidadG(pantalonesMezclilla.getCantidadG() - 1);
					ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "G\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioG());
					return pantalonesMezclilla.getPrecioG();


				case 4:

					pantalonesMezclilla.setCantidadXG(pantalonesMezclilla.getCantidadXG() - 1);
					ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "XG\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioXG());
					return pantalonesMezclilla.getPrecioXG();
				}
			}


		case 3:
			if(null != camisas) {
				switch(talla) {
				case 1:

					camisas.setCantidadCH(camisas.getCantidadCH() - 1);
					ventas.add(camisas.getNombre() + "\t|\t" + "CH\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioCH());

					return camisas.getPrecioCH();


				case 2:

					camisas.setCantidadM(camisas.getCantidadM() - 1);
					ventas.add(camisas.getNombre() + "\t|\t" + "M\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioM());
					return camisas.getPrecioM();


				case 3:

					camisas.setCantidadG(camisas.getCantidadG() - 1);
					ventas.add(camisas.getNombre() + "\t|\t" + "G\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioG());
					return camisas.getPrecioG();


				case 4:

					camisas.setCantidadXG(camisas.getCantidadXG() - 1);
					ventas.add(camisas.getNombre() + "\t|\t" + "XG\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioXG());
					return camisas.getPrecioXG();
				}
			}


		case 4:
			if(null != playeras) {
				switch(talla) {
				case 1:

					playeras.setCantidadCH(playeras.getCantidadCH() - 1);
					ventas.add(playeras.getNombre() + "\t|\t" + "CH\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioCH());
					return playeras.getPrecioCH();


				case 2:

					playeras.setCantidadM(playeras.getCantidadM() - 1);
					ventas.add(playeras.getNombre() + "\t|\t" + "M\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioM());
					return playeras.getPrecioM();


				case 3:

					playeras.setCantidadG(playeras.getCantidadG() - 1);
					ventas.add(playeras.getNombre() + "\t|\t" + "G\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioG());
					return playeras.getPrecioG();


				case 4:

					playeras.setCantidadXG(playeras.getCantidadXG() - 1);
					ventas.add(playeras.getNombre() + "\t|\t" + "XG\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioXG());
					return playeras.getPrecioXG();
				}


			}
		}
		return null;
	}


	public String tPrendas() {
		return pantalonesVestir.toString() +"\n"+ pantalonesMezclilla +"\n"+ camisas +"\n"+ playeras +"\n";
	}




}
