public class DonRamon implements Inquilino, Habitante, Educador{
	private String nombre = "Don Ramon"; 

	@Override 
	public void pagarRenta(){
		System.out.println( nombre + " le jura al señor barriga que le paga la proxima semana");
	}

	@Override 
	public void interactuarConElChavo(){
		System.out.println(nombre + " le mete un vergazo al chavo"); 
	}

	@Override
	public void impartirClase(){
		System.out.println(nombre + ": esto significa, PELIGRO!"); 
	}

	public void pasarLista(){
		System.out.println(nombre + ": Pasando lista"); 
	}

	public void hacerCoraje(){
		System.out.println(nombre + ": REPROBADO!!"); 
	}
}
