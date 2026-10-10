public class App{
	public static void main(String[] args){
		DonRamon ramon = new DonRamon(); 
		DonaFlorinda florinda = new DonaFlorinda(); 
		Ñoño ñoño = new Ñoño(); 

		System.out.println( "==La vesinda' del shavo'==" ); 
		ramon.daGolpe(); 
		ramon.pagarRenta(); 

		try{
			ramon.cobrarRenta(); 
		} catch (UnsupportedOperationException e){
			System.out.println(e.getMessage()); 
		}
		try{
			ramon.jugar(); 
		} catch (UnsupportedOperationException e){
			System.out.println(e.getMessage()); 
		}
		try{
			ramon.llorar(); 
		} catch(UnsupportedOperationException e){
			System.out.println(e.getMessage()); 
		}

				
	}
}
