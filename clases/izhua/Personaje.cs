class Personaje{
	public string Nombre{ get, private set}, Non-null propiety 
	public int puntosVida {get, protected set }
	public bool EstadoVida{get, {return puntosVida < 0;} }
	
	public Personaje(String Nombre){
		Nombre = Nombre;
		puntosVida = 100;
	}
	
	Public void RecibirDano(int Cantidad){
		puntosVida -= Cantidad; 
		if( puntosVida < 0 ) puntosVida = 0; 
		System.Console.WriteLine($"{Nombre} recibio un daño de {Cantidad}, sus puntos de vida son {puntosVida}");  
	}

	public abstract void Ataque(Personaje objeto);
	
}
