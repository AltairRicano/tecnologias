public abstract class Nivel {
	protected String nombre; 
	
	public Nivel(String nombre){
		this.nombre = nombre;
	}

	public abstract Enemigo crearEnemigo(); 

	public void jugar(){
		Enemigo enemigo = crearEnemigo(); 
		int vidaJugador = 250; 
		int danoJugador = 60; 
		int turno = 1; 
		System.out.println("\n=== " + nombre + " ==="); 
		System.out.println("Aparece un " + enemigo.getNombre() + " con " + enemigo.getVida() + " de vida"); 

		while(enemigo.estaVivo() && vidaJugador > 0) {
			System.out.println("\n turno: " + turno); 

			enemigo.recibirDano(danoJugador); 
			System.out.println("haz atacado al " + enemigo.getNombre() + ". Le quedan " + enemigo.getVida());

			if(enemigo.estaVivo()) {
				enemigo.atacar(); 
				vidaJugador -= enemigo.getAtaque(); 
				System.out.println("Te han atacado!!! te quedan " + vidaJugador + "puntos de vida");
			}
			turno ++; 
		}
		if(vidaJugador > 0) {
			System.out.println("GANASTE!!!"); 
		} else {
			System.out.println("Perdiste!!! El " + enemigo.getNombre() + " te vencio"); 
		}
	}

}
