package ar.edu.ort.tp1.pacial1.clases;

public class Rectangular extends Pizza {

	private static final String MSG_RECTANGULAR = "%-12s - %-15s - Precio de Venta: $%8.2f - %d porciones - %s\n";
	private static final float PRECIO_POR_PORCION = 45f;
	//TODO A completar
	private long largo;
	private long ancho;
	private AdicionalQueso adicionalQueso;

	//TODO A completar
	public Rectangular(String nombre, float costoBase, float porcentajeGanancia, long largo, long ancho, AdicionalQueso adicionalQueso) {
		super(nombre, costoBase, porcentajeGanancia);
		this.largo = largo;
		this.ancho = ancho;
		this.adicionalQueso = adicionalQueso;
	}

	//TODO A completar
	// Costo de produccion + Precio de las porciones (ancho y largo) y todo eso 
	//	se multiplica por el adicional del queso.
	//
	@Override
	public float getPrecioDeCosto() {
		float costo;
		costo = (getCostoDeProduccion() + (PRECIO_POR_PORCION * this.largo * this.ancho));
		costo = costo * adicionalQueso.getMultiplicadorQueso();
		return costo;
	}
	
	@Override
	public void mostrar() {
		//TODO A completar
		System.out.printf(MSG_RECTANGULAR, 
				getClass().getSimpleName(),
				this.getNombre(),
				getPrecioDeVenta(),
				this.largo * this.ancho,
				adicionalQueso.getDescripcion());
		
	}

}
