public class Lampara implements ActivablePorRedstone{
	@Override 
	public void activar(){
		System.out.println("Lampara de activa y se enciende"); 
	}

	public void desactivar(){
		System.out.println("Lampara se desactiva y se apaga");
	}
}
