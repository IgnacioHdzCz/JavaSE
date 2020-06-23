package com.javastandaredition.instanciaystatic;

public class Alumno extends Persona {
	
	//Sin el static es un metodo de instancia
	//cuando se le agrega el static ya es un metodo
	//estatico
	public  int sumar(int numero) {
		return numero + 2;
	}


}
