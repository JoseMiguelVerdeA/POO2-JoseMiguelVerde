package edu.udelp.poo.model;

import java.util.Random;

import lombok.Data;

@Data
public class Prenda {

	private String nombre;
	private Double precioCompra;
	private Double precioCH;
	private Double precioM;
	private Double precioG;
	private Double precioXG;
	private Integer cantidadCH;
	private Integer cantidadM;
	private Integer cantidadG;
	private Integer cantidadXG;
	private Integer codigo;
	
	public Prenda(String nombre, Double precioCompra, Integer cantidadCH, Integer cantidadM, Integer cantidadG, Integer cantidadXG) {
		
		Random random = new Random();
		this.codigo = random.nextInt(999)+1000;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.cantidadCH = cantidadCH;
		this.cantidadM = cantidadM;
		this.cantidadG = cantidadG;
		this.cantidadXG = cantidadXG;
		this.precioCH *= 1.1;
		this.precioM *= 1.1;
		this.precioG *= 1.2;
		this.precioXG *= 1.2;
	}
	
	public void anadir(Integer cantidadCH, Integer cantidadM, Integer cantidadG, Integer cantidadXG) {
		this.cantidadCH += cantidadCH;
		this.cantidadM += cantidadM;
		this.cantidadG += cantidadG;
		this.cantidadXG += cantidadXG;
	}

	@Override
	public String toString() {
		return "Prenda [nombre=" + ((nombre==null)?"":nombre) + ", precioCompra=" + ((precioCompra==null)?"":precioCompra) + ", precioCH=" + ((precioCH==null)?"":precioCH) + ", precioM="
				+ ((precioM==null)?"":precioM) + ", precioG=" + ((precioG==null)?"":precioG) + ", precioXG=" + ((precioXG==null)?"":precioXG) + ", cantidadCH=" + ((cantidadCH==null)?"":cantidadCH)
				+ ", cantidadM=" + ((cantidadM==null)?"":cantidadM) + ", cantidadG=" + ((cantidadG==null)?"":cantidadG) + ", cantidadXG=" + ((cantidadXG==null)?"":cantidadXG) + ", codigo="
				+ ((codigo==null)?"":codigo) + "]";
		
	}
	
	
	
	
	
	
}
