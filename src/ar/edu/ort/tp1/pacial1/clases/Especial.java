package ar.edu.ort.tp1.pacial1.clases;

public class Especial extends Pizza {
	private static final String MSG_ESPECIAL = "%-12s - %-15s - Precio de Venta: $%8.2f - %d fainas - %s\n";
	private static final float PRECIO_UNITARIO_FAINA = 70f;
	//TODO A completar
	private int 			cantidadFainas;
	private TamanioDePizza 	tamanioDePizza;

	//TODO A completar
	public Especial(String nombre, float costoBase, float porcentajeGanancia, int cantidadFainas, TamanioDePizza tamanioDePizza) {
		super(nombre, costoBase, porcentajeGanancia);
		this.tamanioDePizza = tamanioDePizza;
		this.cantidadFainas = cantidadFainas;
	}

	//TODO A completar
	// Costo de produccion * el porcentaje del tamaño. 
	//	A todo eso se le suma las cantidades de Faina por el precio unitario de cada faina.
	//
	@Override
	public float getPrecioDeCosto() {
		float costo;
		costo = getCostoDeProduccion() * tamanioDePizza.getPorcentaje();
		costo = costo + (PRECIO_UNITARIO_FAINA * cantidadFainas);
		return costo;
	}
	
	@Override
	public void mostrar() {
		//TODO A completar
		System.out.printf(MSG_ESPECIAL, 
				getClass().getSimpleName(),
				this.getNombre(),
				getPrecioDeVenta(),
				cantidadFainas,
				tamanioDePizza.getDescripcion());
		
	}

}
