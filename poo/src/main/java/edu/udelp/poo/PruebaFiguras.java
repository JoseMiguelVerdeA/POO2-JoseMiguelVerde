package edu.udelp.poo;

import edu.udelp.poo.model.AbstractFigura;
import edu.udelp.poo.model.Cuadrado;
import edu.udelp.poo.model.Figura;
import edu.udelp.poo.model.Rectangulo;
import edu.udelp.poo.model.TrianguloEquilatero;

public class PruebaFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFigura fL = new Cuadrado(3D);
		fL.getResultados();
		
		fL = new Rectangulo(10D, 2D);
		fL.getResultados();
		
		Figura f = new TrianguloEquilatero(3D,3D);
		Double res = f.perimetro();
		System.out.println(res);
		
	}

}
