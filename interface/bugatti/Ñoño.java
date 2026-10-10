public class Ñoño implements AccionesPersonaje{
	private final String nombre = "Ñoño"; 

	@Override 
	public void daGolpe(){
		throw new UnsupportedOperationException( nombre + " Es un niño, no le pega a nadie");
	}

	@Override 
	public void pagarRenta(){
		throw new UnsupportedOperationException ( nombre + " No paga renta, su papá es el dueño");
	}

	@Override 
	public void cobrarRenta(){
		throw new UnsupportedOperationException( nombre + ": No es dueño de la vecindad.");
	}

	@Override
	public void jugar(){
		System.out.println( nombre + ": Juega a la pelota.");
	}

	@Override
	public void llorar(){
		System.out.println( nombre + ": Aja-i, aja-i"); 
	}
}
