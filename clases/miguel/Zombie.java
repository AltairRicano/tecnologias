public class Zombie extends MobHostil {
	public Zombie(){
		super("Zombie", 2); 
	}

	@Override 
	void atacar(){
		System.out.println("El zombie te ataca"); 
	}	
}
