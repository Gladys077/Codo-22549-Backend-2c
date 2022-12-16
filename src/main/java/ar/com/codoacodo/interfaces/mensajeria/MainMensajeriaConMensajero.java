package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConMensajero {

	public static void main(String[] args) {
		String target = "A";
		String mensaje = "Aprendiendo interfaces en java";
		
		var mensajero = new Mensajero();
		
		switch (target) {
			case "A":
				mensajero.setMensajeria(new EnviarMailImpl());
				break;
			case "B":
				mensajero.setMensajeria(new EnviarHDImpl());
				break;
			case "C":
				mensajero.setMensajeria(new EnviarDBImpl());
				break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
		
		if(mensajero.tieneMensajeria()) {
			mensajero.mandarMensaje(mensaje);
	}
	
	//este newEnviar etc es lo mismo que instanciar la clase y 
	//luego pasarlo por parámetro, en lugar de la linea 13
	//tendría que poner:
	//var msj = new EnviarMailImpl();
	//mensajero.setMensajeria(msj);

}
