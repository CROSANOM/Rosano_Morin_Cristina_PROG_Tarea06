package alquilerVehiculos.mvc.modelo.dominio.vehiculo;

import alquilerVehiculos.mvc.dominio.vehiculo.DatosTecnicosVehiculo;
import alquilerVehiculos.mvc.dominio.vehiculo.Vehiculo;

public class Autobus extends Vehiculo {

	// atributo
	double precioEspecificoAutobus = 0;

	// constructor:
	// public Vehiculo(String matricula, String marca, String modelo,
	// DatosTecnicosVehiculo datosTecnicos) {

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param datosTecnicos
	 */
	public Autobus(String matricula, String marca, String modelo, DatosTecnicosVehiculo datosTecnicos) {
		super(matricula, marca, modelo, datosTecnicos);

	}

	// constructor Copia

	public Autobus(Vehiculo vehiculo) {
		super(vehiculo);
	}

	public TipoVehiculo getTipoVehiculo() {

		return TipoVehiculo.AUTOBUS;
	}

	public double getPrecioEspecifico() {

		// calcular precio especifico autobus

		precioEspecificoAutobus = (getPrecioEspecifico() * FACTOR_CILINDRADA / 50) + 1 * FACTOR_NUMERO_PLAZAS;

		return precioEspecificoAutobus;
	}

}
