package edu.udelp.poo.model;

import edu.udelp.poo.process.IngresoRetiro;

public class Cajero {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Cuenta cuenta = new Cuenta();
		IngresoRetiro inRet = new IngresoRetiro();
		
		cuenta.setTitular("Luis Ochoa");
		
		cuenta = inRet.ingresar(cuenta, 10D);
		
		System.out.println(cuenta);
	}

}
