package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class Pizzeria implements Mostrable {

	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final String MSG_FABRICANDO = "Fabricando la Pizza: ";
	//TODO A completar
	

	public boolean fabricar(Pizza m) {
		//TODO A completar
	}


	/**
	 * Retorna la sumatoria de los precios de Venta de nombre de la pizza enviado por parametro. 
	 * @param nombre
	 * @return
	 */
	public float sumatoriaDePizzas(String nombre) {
		//TODO A completar
		float 	total = 0;
		
		return total;
	}
	
	/**
	 * 	Retorna la cantidad de pizzas vendidas con el precio de venta entre los parametros enviados.
	 * 	Los valores enviados son inclusivos.
	 * @param precioInferior
	 * @param precioSuperior
	 * @return
	 */
	
	public int vendidasConPrecioEntre(float precioInferior, float precioSuperior) {
		//TODO A completar
		int 	cantidad = 0;
		return cantidad;
	}
	
	/**
	 * Retorna el precio de venta de la primer pizza enviada por parametro.
	 * En caso de no encontrarse retorna 0.
	 * @param nombre
	 * @return
	 */
	public float precioVentaDeLaPrimerPizza(String nombre) {
		//TODO A completar
		float   precio 		= 0;
		return precio;
	}
}
