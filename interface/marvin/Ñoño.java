public class Ñoño implements Niño {
	private String nombre = "Ñoño"; 

	@Override 
	public void llorar(){
		System.out.println("Aja-i, aja-i"); 
	}

	@Override
	public void cantar(){
		System.out.println(nombre + ": Ay ay ay ay. Canta y no llores");
	}
}
