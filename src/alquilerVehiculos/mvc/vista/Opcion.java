package alquilerVehiculos.mvc.vista;

import alquilerVehiculos.mvc.modelo.dominio.ExcepcionAlquilerVehiculos;
import alquilerVehiculos.mvc.vista.IUTextual;

public enum Opcion {
	
	SALIR("Salir") {
		public void ejecutar() {
			vista.salir();
		}
	},
	ANADIR_CLIENTE("A�adir Cliente") {
		public void ejecutar() {
			vista.anadirCliente();
		}
	},
	BORRAR_CLIENTE("Borrar Cliente") {
		public void ejecutar() {
			vista.borrarCliente();
		}
	},
	
	BUSCAR_CLIENTE("Buscar Cliente") {
		public void ejecutar() {
			vista.buscarCliente();
		}
	},
	LISTAR_CLIENTES("Listar Clientes") {
		public void ejecutar() {
			vista.listarClientes();
		}
	},
	ANADIR_TURISMO("A�adir turismo") {
public void ejecutar() {
		vista.anadirTurismo();
		}
	},
	
	BORRAR_TURISMO("Borrar turismo") {
		public void ejecutar() {
			vista.borrarTurismo();
		}
	},
	BUSCAR_TURISMO("Buscar turismo") {
		public void ejecutar() {
			vista.buscarTurismo();
		}
	},
	LISTAR_TURISMOS("Listar turismos") {
		public void ejecutar() {
			vista.listarTurismos();
		}
	},
	ABRIR_ALQUILER("Abrir alquiler") {
		public void ejecutar() {
			vista.abrirAlquiler();
		}
	},
	CERRAR_ALQUILER("Cerrar alquiler") {
		public void ejecutar() {
			vista.cerrarAlquiler();
		}
	},
	LISTAR_ALQUILER("Listar alquileres") {
		public void ejecutar() {
			vista.listarAlquileres();
		}
	};

	// Atributos de la clase
	private static IUTextual vista;
	private String mensaje = "";

	// Constructor de opciones.
	private Opcion(String mensaje) {
		this.mensaje = mensaje;
	}

	// M�todo que ejecuta cada opci�n.
	public abstract void ejecutar();

	public String getMensaje() {
		return mensaje;
	}

	// Establece la vista (Menu) para esta clase.
	public static void setVista(IUTextual vista) {
		Opcion.vista = vista;
	}

	// Formato de salida del menu.
	public String toString() {
		return String.format("%d.- %s", ordinal(), mensaje);
	}

	public static Opcion getOpcionSegunOrdinal(int ordinal) {
		if (esOrdinalValido(ordinal))
			return values()[ordinal];
		else
			throw new ExcepcionAlquilerVehiculos("Opci�n no v�lida");
	}

	public static boolean esOrdinalValido(int ordinal) {
		return (ordinal >= 0 && ordinal <= values().length - 1) ? true : false;
	}

}
