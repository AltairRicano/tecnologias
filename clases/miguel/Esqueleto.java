public class Esqueleto extends MobHostil {
	public Esqueleto(){
		super("Esqueleto", 5);
	}

	@Override
	void atacar(){
		System.out.println("El equeleto te lanza una flecha"); 
	}
}
