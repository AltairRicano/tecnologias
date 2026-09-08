public class App {

	public static void main(String[] args) throws Exception {
	
		Caja caja = new Caja(); 

		MetodoPago tarjeta = new Tarjeta("1234567891123456"); 
		MetodoPago paypal = new Paypal("example@yo");
		MetodoPago contado = new Contado(true); 

		caja.cobrar(tarjeta, 500); 
		caja.cobrar(paypal, 1000); 
		caja.cobrar(contado, 1500); 
		
	}
}
