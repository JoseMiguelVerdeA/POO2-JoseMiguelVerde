package edu.udelp.poo.process;

import edu.udelp.poo.model.Cuenta;

public class IngresoRetiro {

	public Cuenta retirar(Cuenta cuenta, Double monto) throws Exception {

		if(null == monto || monto < 0) {
			throw new Exception("El monto no puede ser nulo / negativo..");
		}

		Double cantidad = cuenta.getCantidad() - monto;
		cuenta.setCantidad(cantidad);

		if(cantidad < 0) {
			cuenta.setCantidad(0D);
		}
		return cuenta;
	}

	public Cuenta ingresar(Cuenta cuenta, Double monto) throws Exception {

		if(null == monto || monto < 0) {
			throw new Exception("El monto no puede ser nulo / negativo.");
		}

		Double cantidad = cuenta.getCantidad() + monto;
		cuenta.setCantidad(cantidad);

		return cuenta;
	}


}

