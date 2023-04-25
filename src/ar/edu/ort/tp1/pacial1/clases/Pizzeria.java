package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class Pizzeria implements Mostrable {

	private static final String MSG_TOTALES = "La venta total fue: $%8.2f\n";
	private static final String MSG_CANTIDADES = "Se han fabricado: %d Tradicionales, %d Especiales y %d Rectangulares\n";
	private static final String MSG_FABRICANDO = "Fabricando la Pizza: ";
	//TODO A completar
	private ArrayList<Pizza> 	pizzasFabricadas;
	private String 				nombre;

	
	public Pizzeria(String nombre) {
		//TODO A completar
		this.nombre 			= nombre;
		this.pizzasFabricadas 	= new ArrayList<Pizza>();
	}

	public boolean fabricar(Pizza m) {
		//TODO A completar
		boolean retorno = false;
		if (m != null) {
			System.out.print(MSG_FABRICANDO);
			m.mostrar();
			retorno = this.pizzasFabricadas.add(m);
		}
		return retorno;
	}

	@Override
	public void mostrar() {
		//TODO A completar
		int 	cantEspecial 	= 0;
		int 	cantRectangular 		= 0;
		int 	cantTradicional 		= 0;
		float 	ventasTotales = 0;		
		

		System.out.println("Pizzeria: " + nombre);
		for (Pizza pizza : pizzasFabricadas) {
			if (pizza instanceof Tradicional) {
				cantTradicional++;
			} else if (pizza instanceof Especial) {
				cantEspecial++;
			} else if (pizza instanceof Rectangular) {
				cantRectangular++;
			}
			ventasTotales += pizza.getPrecioDeVenta();
		}

		System.out.printf(MSG_CANTIDADES, cantTradicional, cantEspecial, cantRectangular);
		System.out.printf(MSG_TOTALES, ventasTotales);
	}

	/**
	 * Retorna la sumatoria de los precios de Venta de nombre de la pizza enviado por parametro. 
	 * @param nombre
	 * @return
	 */
	public float sumatoriaDePizzas(String nombre) {
		//TODO A completar
		float 	total = 0;
		Pizza	pizzaAuxiliar;
		
		for (int i = 0; i < this.pizzasFabricadas.size(); i++) {
			pizzaAuxiliar = this.pizzasFabricadas.get(i);
			if (pizzaAuxiliar.getNombre().equalsIgnoreCase(nombre)) {
				total		+= pizzaAuxiliar.getPrecioDeVenta();
			}
		}
		
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
		Pizza	pizzaAuxiliar;
		
		for (int i = 0; i < this.pizzasFabricadas.size(); i++) {
			pizzaAuxiliar = this.pizzasFabricadas.get(i);
			if ((pizzaAuxiliar.getPrecioDeVenta() >= precioInferior)  && 
				(pizzaAuxiliar.getPrecioDeVenta() <= precioSuperior)){
				cantidad++;
			}
		}
		
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
		boolean encontrada = false;
		float   precio 		= 0;
		int 	idx 		= 0;
		Pizza	pizzaAuxiliar;
		while (!encontrada && idx < this.pizzasFabricadas.size()) {
			pizzaAuxiliar = this.pizzasFabricadas.get(idx);
			if (pizzaAuxiliar.getNombre().equalsIgnoreCase(nombre)) {
				encontrada 	= true;
				precio		= pizzaAuxiliar.getPrecioDeVenta();
			}
			idx++;
		}
		return precio;
	}
}
