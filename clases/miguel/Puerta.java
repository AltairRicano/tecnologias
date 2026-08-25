public class Puerta implements ActivablePorRedstone{
	@Override 
	public void activar(){
		System.out.println("Puerta recibe señal y se abre"); 
	}

	public void desactivar(){
		System.out.println("Puerta deja de recibir la señal y se cierra");
	}
}
