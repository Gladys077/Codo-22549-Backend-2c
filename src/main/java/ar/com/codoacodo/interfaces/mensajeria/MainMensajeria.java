package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target = "C";
		String mensaje = "Aprendiendo interfaces en java;"
		
		var mensajero = new Mensajero();
		
		switch (target) {
			case "A":
				mensajero.setMensajeria(new EnviarMail());
				break;
			case "B":
				mensajero.setMensajeria(new EnviarHD());
				break;
			case "C":
				mensajero.setMensajeria(new EnviarADB());
				break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
	}

}
