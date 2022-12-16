package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConCreadorDeMensajeria {

	public static void main(String[] args) {
		String target = "";
		
		String mensaje = "Aprendiendo interfaces en java";
				
		IEnviar msj = CreadorDeMensajeria.crearMensajeria(target);
		
		msj.enviar(mensaje);
	}
}
	//este newEnviar etc es lo mismo que instanciar la clase y 
		//luego pasarlo por parámetro, en lugar de la linea 13
		//tendría que poner:
		//var msj = new EnviarMailImpl();
		//mensajero.setMensajeria(msj);

