public class Piston implements ActivablePorRedstone{
	@Override 
	public void activar(){
		System.out.println("Pistón de activa y empuja un bloque"); 
	}

	public void desactivar(){
		System.out.println("Pistón se desactiva y retrae el bloque");
	}
}
