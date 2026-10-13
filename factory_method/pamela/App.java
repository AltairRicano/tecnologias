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

			if (option >= 1 && option <= 3){
				Nivel nivel = new Nivel(option);
				nivel.jugar();  
			}
			else if(option != 0){
				System.out.println("Opcion invalida"); 
			}
		}
		sc.close(); 
	}
}
