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
		default:
			System.out.println("Opcion invalida.");
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
					if(pantalonesVestir!=null && pantalonesVestir.getCantidadCH()>=1) {
						pantalonesVestir.setCantidadCH(pantalonesVestir.getCantidadCH() - 1);
						ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "CH\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioCH());
						return pantalonesVestir.getPrecioCH();
					}
					break;

				case 2:
					if(pantalonesVestir!=null && pantalonesVestir.getCantidadM()>=1) {
						pantalonesVestir.setCantidadM(pantalonesVestir.getCantidadM() - 1);
						ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "M\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioM());
						return pantalonesVestir.getPrecioM();
					}
					break;

				case 3:
					if(pantalonesVestir!=null && pantalonesVestir.getCantidadG()>=1) {
						pantalonesVestir.setCantidadG(pantalonesVestir.getCantidadG() - 1);
						ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "G\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioG());
						return pantalonesVestir.getPrecioG();
					}
					break;

				case 4:
					if(pantalonesVestir!=null && pantalonesVestir.getCantidadXG()>=1) {
						pantalonesVestir.setCantidadXG(pantalonesVestir.getCantidadXG() - 1);
						ventas.add(pantalonesVestir.getNombre() + "\t|\t" + "XG\t|\t1" + pantalonesVestir.getPrecioCompra() + "\t|\t" + pantalonesVestir.getPrecioXG());
						return pantalonesVestir.getPrecioXG();
					}
					break;
				}
			}


		case 2:
			if(null != pantalonesMezclilla) {
				switch(talla) {
				case 1:
					if(pantalonesMezclilla!=null && pantalonesMezclilla.getCantidadCH()>=1) {
						pantalonesMezclilla.setCantidadCH(pantalonesMezclilla.getCantidadCH() - 1);
						ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "CH\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioCH());
						return pantalonesMezclilla.getPrecioCH();
					}
					break;


				case 2:
					if(pantalonesMezclilla!=null && pantalonesMezclilla.getCantidadM()>=1) {
						pantalonesMezclilla.setCantidadM(pantalonesMezclilla.getCantidadM() - 1);
						ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "M\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioM());
						return pantalonesMezclilla.getPrecioM();
					}
					break;


				case 3:
					if(pantalonesMezclilla!=null && pantalonesMezclilla.getCantidadG()>=1) {
						pantalonesMezclilla.setCantidadG(pantalonesMezclilla.getCantidadG() - 1);
						ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "G\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioG());
						return pantalonesMezclilla.getPrecioG();
					}
					break;


				case 4:
					if(pantalonesMezclilla!=null && pantalonesMezclilla.getCantidadXG()>=1) {
						pantalonesMezclilla.setCantidadXG(pantalonesMezclilla.getCantidadXG() - 1);
						ventas.add(pantalonesMezclilla.getNombre() + "\t|\t" + "XG\t|\t1" + pantalonesMezclilla.getPrecioCompra() + "\t|\t" + pantalonesMezclilla.getPrecioXG());
						return pantalonesMezclilla.getPrecioXG();
					}
					break;
				}
			}


		case 3:
			if(null != camisas) {
				switch(talla) {
				case 1:
					if(camisas!=null && camisas.getCantidadCH()>=1) {
						camisas.setCantidadCH(camisas.getCantidadCH() - 1);
						ventas.add(camisas.getNombre() + "\t|\t" + "CH\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioCH());

						return camisas.getPrecioCH();
					}
					break;


				case 2:
					if(camisas!=null && camisas.getCantidadM()>=1) {
						camisas.setCantidadM(camisas.getCantidadM() - 1);
						ventas.add(camisas.getNombre() + "\t|\t" + "M\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioM());
						return camisas.getPrecioM();
					}
					break;

				case 3:
					if(camisas!=null && camisas.getCantidadG()>=1) {
						camisas.setCantidadG(camisas.getCantidadG() - 1);
						ventas.add(camisas.getNombre() + "\t|\t" + "G\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioG());
						return camisas.getPrecioG();
					}
					break;

				case 4:
					if(camisas!=null && camisas.getCantidadXG()>=1) {
						camisas.setCantidadXG(camisas.getCantidadXG() - 1);
						ventas.add(camisas.getNombre() + "\t|\t" + "XG\t|\t1" + camisas.getPrecioCompra() + "\t|\t" + camisas.getPrecioXG());
						return camisas.getPrecioXG();
					}
					break;
				}
			}


		case 4:
			if(null != playeras) {
				switch(talla) {
				case 1:

					if(playeras!=null && playeras.getCantidadCH()>=1) {
						playeras.setCantidadCH(playeras.getCantidadCH() - 1);
						ventas.add(playeras.getNombre() + "\t|\t" + "CH\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioCH());
						return playeras.getPrecioCH();
					}
					break;


				case 2:
					if(playeras!=null && playeras.getCantidadM()>=1) {
						playeras.setCantidadM(playeras.getCantidadM() - 1);
						ventas.add(playeras.getNombre() + "\t|\t" + "M\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioM());
						return playeras.getPrecioM();
					}
					break;


				case 3:
					if(playeras!=null && playeras.getCantidadG()>=1) {
						playeras.setCantidadG(playeras.getCantidadG() - 1);
						ventas.add(playeras.getNombre() + "\t|\t" + "G\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioG());
						return playeras.getPrecioG();
					}
					break;

				case 4:
					if(playeras!=null && playeras.getCantidadXG()>=1) {
						playeras.setCantidadXG(playeras.getCantidadXG() - 1);
						ventas.add(playeras.getNombre() + "\t|\t" + "XG\t|\t1" + playeras.getPrecioCompra() + "\t|\t" + playeras.getPrecioXG());
						return playeras.getPrecioXG();
					}
					break;
				}


			}
		}
		return null;
	}


	public String tPrendas() {
		return pantalonesVestir +"\n"+ pantalonesMezclilla +"\n"+ camisas +"\n"+ playeras +"\n";
	}




}
