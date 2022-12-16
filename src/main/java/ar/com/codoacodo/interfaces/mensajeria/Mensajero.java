package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajero {

	private IEnviar mensajeria;
	
	public void setMensajeria(IEnviar mensajeria) {
		this.mensajeria = mensajeria;
	}
	
	public void mandarMensaje(String msj) {
		this.mensajeria.enviar(msj);
	}
	
	public void tieneMensajeria() {
		return this.mensajeria != null;
	}
}