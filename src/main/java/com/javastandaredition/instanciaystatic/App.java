package com.javastandaredition.instanciaystatic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/*
    	 * Si los dos metodos de instancia
    	 * estan relacionados por una herencia
    	 * padre-hijo, el metodo de la subclase
    	 * escribe al metodo mayor.
    	 * 
    	 * Si los dos metodos son estaticos
    	 * 
    	 */
    	Alumno alumno1 = new Alumno();
        System.out.println( alumno1.sumar(1) );
    }
}
