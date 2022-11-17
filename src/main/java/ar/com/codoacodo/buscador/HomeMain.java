package ar.com.codoacodo.buscador;

public class HomeMain {

	public static void main(String[] args) {
		// para craer un objeto de una clase cualquiera
		// Clase nombredelObjeto = new Clase();
		Buscador miBuscador = new Buscador();
		//ahora miBuscador está vivo puedo 
		//ejecutar cualquiera de sus metodos "publicos"
		
		//primero defino cual es la clave de buscqueda
		miBuscador.cambiarClave("iron man");
		
		//ejecuto el metodo buscar() del objeto miBuscador
		miBuscador.buscar();
		
		//mostrar cuantos resultados hay
		System.out.println("Hemos Encontrado " +miBuscador.getCantRes() + " Resultados Para '"+miBuscador.getClaveBusqueda()+"'");	
		}

}
