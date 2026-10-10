public class ProfesorJirafales implements Educador, Habitante{
	private String nombre = "Profesor Jirafales"; 

	@Override 
	public void pasarLista(){
		System.out.println(nombre + " pasa la lista de clase"); 
	}

	@Override 
	public void impartirClase(){
		System.out.println(nombre + " da su clase"); 
	}

	@Override
	public void hacerCoraje(){
		System.out.println("TA, TA, TA ,TA ,TA!"); 
	}

	@Override
	public void interactuarConElChavo(){
		System.out.println("Sientate, callate y calmate"); 
	}
}
