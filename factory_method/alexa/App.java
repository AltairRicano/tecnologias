import java.util.Scanner; 

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int option = -1; 

		while(option != 0){
			System.out.println("\n1. Bosque oscuro"); 
			System.out.println("2. Castillo Embrujado"); 
			System.out.println("3. Volcan infernal"); 
			System.out.println("0. salir"); 

			option = sc.nextInt(); 

			Nivel nivel = null; 

			switch (option) {
				case 1: 
					nivel = new NivelBosque(); 
					break;
				case 2: 
					nivel = new NivelCastillo(); 
					break; 
				case 3:
					nivel = new NivelVolcan(); 
					break; 
				case 0: 
					System.out.println("Saliendo de la app"); 
					return; 
				default: 
					System.out.println("Elección inválida"); 
					break;
			}
			
			if (nivel != null) {
				nivel.jugar(); 
			}
		}
		
		sc.close(); 
	}
}
