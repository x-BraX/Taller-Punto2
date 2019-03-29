package co.dominio.app;

public class Producto {


	private String nombre;
	private String codigo;
	private int unidadesProducto;
	private double precio;

	public Producto(String nombre, String codigo, int unidadesProducto, double precio) {
		
		this.nombre = nombre;
		this.codigo = codigo;
		this.unidadesProducto = unidadesProducto;
		this.precio = precio;
		
	}
	
	
	public int getUnidadesProducto() {
		return unidadesProducto;
	}

	public void setUnidadesProducto(int unidadesProducto) {
		this.unidadesProducto = 12;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	
	
		public void removerProducto() {
		 this.unidadesProducto = unidadesProducto -1;
		 
		
		}
	
	
		public boolean aumentarUnidadesProducto(int cantidadAAumentar) {
		if (unidadesProducto <= 12 ) {
			if(unidadesProducto + cantidadAAumentar > 12) {
				System.out.println("No se puede tener mas de 12 unidades por producto, la cantidad de: ");
			}
			else {
				this.unidadesProducto += cantidadAAumentar;
				System.out.println("La cantidad aumentada de: ");
			}
		}
		return true;
		
		
	}
		
}
