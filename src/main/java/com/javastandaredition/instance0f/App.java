package com.javastandaredition.instance0f;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Se declara una instancia de tipo String
		 * y se hace hace uso del keyword instanceof
		 * para ver si texto es una instancia de String
		 * 
		 */
//           String texto = new String("Cadena");
//           
//           if(texto instanceof String) {
//        	   System.out.println(new StringBuilder("Es un String"));
//           }
		
		/*
		 * Tambien se puede hacer para clases,
		 * declaramos una clase padre y una hija
		 * 
		 * 
		 */
		
		
//		 Alumno alumno1 = new Alumno();
//		 if (alumno1 instanceof Persona) {
//			 System.out.println(new StringBuilder("Instancia de alumno"));
//			 
//			
//		}
		 
		
		
		/*
		 * Se tiene una canasta en donde solo se permite ingresar objetos metalicos
		 * 
		 * 
		 */
		
		System.out.println(new StringBuilder("Ingrese Objetos Metalicos"));
		List canasta = new ArrayList();
		
		Cuchara cuchara1 = new Cuchara("Sopera");
		Cuchara cuchara2 = new Cuchara("Te");
		Cuchara cuchara3 = new Cuchara("Cafe");
		
		Tela tela1 = new Tela("Seda");
		
		App app = new App();
		
		app.verificar(cuchara1);
		app.verificar(cuchara2);
		app.verificar(cuchara3);
		app.verificar(tela1);
		
	
		
		
	}
	
	
	private void verificar(Object object) {
		if (object instanceof ObjetosMetalicos) {
			System.out.println("Es una cuchara metalica de tipo : " +((ObjetosMetalicos) object).getNombre() ); 
				
		}else {
			System.out.println("Elemento no permitido ");
		}
			
	}

}
