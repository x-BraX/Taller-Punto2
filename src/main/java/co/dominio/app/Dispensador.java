package co.dominio.app;

import java.util.ArrayList;

public class Dispensador {

	private String nombre;
	private ArrayList<Producto> productos;
	private int cantidadDeProductos = 10;

	
	
	public Dispensador(String nombre){
		this.nombre = nombre;
		
	}
	
	public void retirarProducto(String NombreoCodigo) {
		ArrayList<Producto> listaProductos = getProductos();
		for (int i = 0; i <  listaProductos.size(); i++) {
			String nombres = listaProductos.get(i).getNombre();
			String codigo = listaProductos.get(i).getCodigo();
			if (nombres == NombreoCodigo || codigo == NombreoCodigo ){
				listaProductos.get(i).removerProducto();
			}
		}
    } 
	

	public ArrayList<String> consultarProductosAgotados() {
		ArrayList<String> nombresProductosAgotados = new ArrayList<String>();
		ArrayList<Producto> productos = getProductos();
		for (int i = 0; i < productos.size(); i++) {
			int unidadesPorProducto = productos.get(i).getUnidadesProducto();
			if (unidadesPorProducto <= 0 ) {
				String nombresProductos = productos.get(i).getNombre();
				nombresProductosAgotados.add(nombresProductos);
			}
		}
		return nombresProductosAgotados;
	}
	
		
	public int consultarTotalUnidadesDeProducto(Producto producto) {
        return producto.getUnidadesProducto();	
}
	
	public int consultarTotalUnidadesTodosProductos() {
		ArrayList<Producto> productos = getProductos();
		int sumatoria = 0;
		for (int i = 0; i < productos.size(); i++) {
			int unidadesPorProducto = productos.get(i).getUnidadesProducto();
			sumatoria = sumatoria + unidadesPorProducto;
		}
		return sumatoria; 
	}
	
		
	public void aumentarCantidadUnidadesProducto(Producto producto, int cantidadAumentar) {
             producto.aumentarUnidadesProducto(cantidadAumentar);
            	
	}
            	 
    
	
		 
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public ArrayList<Producto> getProductos() {
		return this.productos;
	}
	
}