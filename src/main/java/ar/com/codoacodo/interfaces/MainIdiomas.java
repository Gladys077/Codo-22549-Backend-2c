package ar.com.codoacodo.interfaces;

public class MainIdiomas {

	public static void main(String[] args) {
		
		//nace la persona
		//Persona persona = new Persona()//el var en este 
		//caso reemplaza Persona para evitar la redundancia
		var persona = new Persona("carlos","espa�ol");
		
		System.out.println(persona.getIdioma());
			
		persona.decir("hola");
		
		persona.decir("hola","espa�ol");
		
		persona.decir("hola","portu�ol");
			
		persona.aprender("portu�ol");//f5
		
		persona.decir("hola","portu�ol");
	}

}
