public class BloqueMusical implements ActivablePorRedstone {
	
	public void activar(){
		System.out.println("Bloque recibe señal y reproduce una nota"); 
	}

	public void desactivar(){
		System.out.println("Bloque deja de recibir señal");
	}
}
