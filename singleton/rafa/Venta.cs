public class Venta
{
	private IAlmacen _almacen;

	public Venta(IAlmacen almacen)
	{
		_almacen = almacen; 	
	} 

	public bool CobrarProducto(int codigo, int cantidad)
	{
			Producto venta = _almacen.BuscarProducto(codigo);
			if (_almacen.BuscarProducto(codigo) == null) return false; 
			double total = venta.Precio * cantidad;
			System.Console.Writeline($"[CAJA]: venta realizada con exito por el producto: {venta.Nombre}, por el total {total}");
			return true; 
	}
}
