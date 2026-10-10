public class Program
{
	public static void Main()
	{
		IAlmacen almacenGlobal = AlmacenCrentral.Instancia; 
		Inventario empleadoInventario = new Inventario(almacenGlobal); 
		Venta empleadoVenta = new Venta(almacenGlobal);

		empleadoInventario.RegistrarProducto("Coca", 20.00, 1, 10); 
		empleadoInventario.RegistrarProducto("bubulubu", 5.00, 2, 10); 
		empleadoInventario.RegistrarProducto("Pepsi", 20.00, 3, 10);

		empleadoVenta CobrarProducto(1, 4); 
		empleadoVenta CobrarProducto(2, 4); 
		empleadoVenta CobrarProducto(3, 18); 

		var instancia1 = AlmacenCrentral.Instancia; 
		var instancia2 = AlmacenCrentral.Instancia; 

		if(ReferenceEquals(instancia1, instancia2))
		{
			System.Console.Writeline("Ambos apuntan a la misma instancia"); 
		} 
		
	}
}
