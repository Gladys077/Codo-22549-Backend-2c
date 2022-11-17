package ar.com.codoacodo.buscador;

public class Articulo {

	//atributos
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	
	//constructores
	public Articulo() {
		
	}
	
	//metodos
	public void detalle() {
		//mostrar por consola los datos
		System.out.println("Imagen: " + img);
		System.err.println("Titulo: " + titulo);
		System.err.println("Autor: " + autor);
		System.err.println("Precio: " + precio);

	}
}
