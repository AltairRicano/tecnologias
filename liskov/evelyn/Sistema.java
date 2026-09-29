public class Sistema{
	public static void main(String[] args){
		System.out.println("Sistema Bancario LSP MALO"); 
		CuentaBancaria ahorro = new CuentaAhorro("CA-001", 100000); 
		CuentaBancaria corriente = new CuentaCorriente("CC-001", 5000, 2000);
		CuentaBancaria credito = new CuentaCredito("CR-001", 1500);

		Cliente cliente1 = new Cliente("Alexa", "001", ahorro);
		Cliente cliente2 = new Cliente("Pamela", "002", corriente); 
		Cliente cliente3 = new Cliente("Vanesa", "003", credito); 

		cliente1.depositar(500); 
		cliente2.retirar(2000); 

		System.out.println("Cuentas Ahorro: "); 
		cliente1.mostrarInformacion(); 
		System.out.println("Interes $" + cliente1.calcularIntereses()); 

		cliente2.mostrarInformacion();
		cliente2.retirar(500); 
		System.out.println("Saldo después del retiro $" + cliente2.consultarSaldo);
		System.out.println("Interes por sobregiro: $" + cliente2.calcularIntereses());  

		cliente3.mostrarInformacion(); 
		cliente3.retirar(5000); 
		System.out.println("Deuda: $" + ((CuentaCredito) credito).consultarIntereses() ); 
		}
}
