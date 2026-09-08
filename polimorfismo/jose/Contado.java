public class Contado implements MetodoPago {

	private boolean EstadoBilletes; 
	public Contado(boolean EstadoBilletes){
		this.EstadoBilletes = EstadoBilletes;
	}

	@Override
	public boolean validar(){

		if(EstadoBilletes == true ){
			return true;
		}
		else return false; 		
	}

	@Override 
	public void pagar(double monto){
		System.out.println("El billete está en buen esta en buen estado");
	}
}
