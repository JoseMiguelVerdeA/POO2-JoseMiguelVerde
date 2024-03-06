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
		default:
			System.out.println("Opcion invalida.");
		}
		System.out.println("La prenda no pude ser dada de alta ya que esta ya existe. Prueba agregando articulos al inventario.");
	}

	@Override
	public void anadirAInventario(Integer opcion, Integer cantidadCH, Integer cantidadM, Integer cantidadG, Integer cantidadXG) {
		if(opcion == 5 || opcion == 6) {
			switch(opcion) {
			case 5:
				if(null != blusas) {
					blusas.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
					return;}
				System.out.println("No se pudo agregar a inventario ya que la prenda no existe.");
				break;
				
			case 6:
				if(null != faldas) {
					faldas.anadir(cantidadCH, cantidadM, cantidadG, cantidadXG);
					return;}
				System.out.println("No se pudo agregar a inventario ya que la prenda no existe.");
				break;
			}
		} else {
			super.anadirAInventario(opcion, cantidadCH, cantidadM, cantidadG, cantidadXG);
		}
	}
	
	@Override
	public void modificarPrecio(Integer opcion, Double precio) {
		if(opcion == 5 || opcion == 6) {
			switch(opcion) {
			case 5:
				if(null != pantalonesVestir) {
					blusas.setPrecioCompra(precio);
					return;}
				System.out.println("No se pudo modificar el precio ya que la prenda no existe.");
				break;
				
			case 6:
				if(null != pantalonesMezclilla) {
					faldas.setPrecioCompra(precio);
					return;}
				System.out.println("No se pudo modificar el precio ya que la prenda no existe.");
				break;
			}
		} else {
			super.modificarPrecio(opcion, precio);
		}
	}

	@Override
	public Double venta(Integer opcion, Integer talla) {
		if(opcion == 5 || opcion == 6) {
			switch(opcion) {
			case 5:
				switch(talla) {
				case 1:
					if(blusas!=null && blusas.getCantidadCH()>=1) {
						blusas.setCantidadCH(blusas.getCantidadCH() - 1);
						ventas.add(blusas.getNombre() + "\t|\t" + "CH\t|\t1" + blusas.getPrecioCompra() + "\t|\t" + blusas.getPrecioCH() + "\n");
						return blusas.getPrecioCH();
					}
					break;

				case 2:
					if(blusas!=null && blusas.getCantidadM()>=1) {
						blusas.setCantidadM(blusas.getCantidadM() - 1);
						ventas.add(blusas.getNombre() + "\t|\t" + "M\t|\t1" + blusas.getPrecioCompra() + "\t|\t" + blusas.getPrecioM()+ "\n");
						return blusas.getPrecioM();
					}
					break;

				case 3:
					if(blusas!=null && blusas.getCantidadG()>=1) {
						blusas.setCantidadG(blusas.getCantidadG() - 1);
						ventas.add(blusas.getNombre() + "\t|\t" + "G\t|\t1" + blusas.getPrecioCompra() + "\t|\t" + blusas.getPrecioG()+ "\n");
						return blusas.getPrecioG();
					}
					break;

				case 4:
					if(blusas!=null && blusas.getCantidadXG()>=1) {
						blusas.setCantidadXG(blusas.getCantidadXG() - 1);
						ventas.add(blusas.getNombre() + "\t|\t" + "XG\t|\t1" + blusas.getPrecioCompra() + "\t|\t" + blusas.getPrecioXG()+ "\n");
						return blusas.getPrecioXG();
					}
					break;
				}

			case 6:
				switch(talla) {
				case 1:
					if(faldas!=null && faldas.getCantidadCH()>=1) {
					faldas.setCantidadCH(faldas.getCantidadCH() - 1);
					ventas.add(faldas.getNombre() + "\t|\t" + "CH\t|\t1" + faldas.getPrecioCompra() + "\t|\t" + faldas.getPrecioCH()+ "\n");
					return faldas.getPrecioCH();
					}
					break;

				case 2:
					if(faldas!=null && faldas.getCantidadM()>=1) {
					faldas.setCantidadM(faldas.getCantidadM() - 1);
					ventas.add(faldas.getNombre() + "\t|\t" + "M\t|\t1" + faldas.getPrecioCompra() + "\t|\t" + faldas.getPrecioM()+ "\n");
					return faldas.getPrecioM();
					}
					break;

				case 3:
					if(faldas!=null && faldas.getCantidadG()>=1) {
					faldas.setCantidadG(faldas.getCantidadG() - 1);
					ventas.add(faldas.getNombre() + "\t|\t" + "G\t|\t1" + faldas.getPrecioCompra() + "\t|\t" + faldas.getPrecioG()+ "\n");
					return faldas.getPrecioG();
					}
					break;

				case 4:
					if(faldas!=null && faldas.getCantidadXG()>=1) {
					faldas.setCantidadXG(faldas.getCantidadXG() - 1);
					ventas.add(faldas.getNombre() + "\t|\t" + "XG\t|\t1" + faldas.getPrecioCompra() + "\t|\t" + faldas.getPrecioXG()+ "\n");
					return faldas.getPrecioXG();
					}
					break;
				}
			}
		} else {
			return super.venta(opcion, talla);
		}
		return null;
	}
	
	
	@Override
	public String tPrendas() {
		return super.tPrendas() + blusas +"/n"+ faldas +"/n";
	}
	
	
}
