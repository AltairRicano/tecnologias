public class DonaFlorinda implements AccionesPersonaje{
	private final String nombre = "Doñaflorinda"; 

	@Override 
	public void daGolpe(){
		System.out.println(nombre + ": Le pega un cachetadazo a don ramon "); 
	}

	@Override 
	public void pagarRenta(){
		throw new UnsupportedOperationException ( nombre + "Paga la renta de 5k");
	}

	@Override 
	public void cobrarRenta(){
		throw new UnsupportedOperationException( nombre + ": No es dueño de la vecindad.");
	}

	@Override
	public void jugar(){
		throw new UnsupportedOperationException( nombre + ": No juega a nada");
	}

	@Override
	public void llorar(){
		throw new UnsupportedOperationException( nombre + ": No llora"); 
	}
}
