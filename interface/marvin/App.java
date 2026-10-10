import java.util.List; 

public class App {
	public static void main(String[] args) throws Exception{

		Ñoño ñoño = new Ñoño(); 
		DonRamon ramon = new DonRamon(); 
		ProfesorJirafales jirafales = new ProfesorJirafales(); 

		List<Educador> educadores = List.of(jirafales, ramon); 
		for( Educador e: educadores ){
			e.impartirClase(); 
			e.pasarLista(); 
			e.hacerCoraje(); 
		}

		// Interfaz para don ramón
		List<Inquilino> inquilinos = List.of(ramon); 
		for (Inquilino i: inquilinos) {
			i.pagarRenta();
		}

		List<Habitante> habitantes = List.of(jirafales, ramon); 
		for(Habitante h: habitantes){
			h.interactuarConElChavo(); 
		}

		List<Niño> niños = List.of(ñoño); 
		for(Niño n: niños){
			n.cantar(); 
			n.llorar(); 
		}
	}
}
