import java.util.*;
public class Ejercicio8{
	public static void main(String args[]){
		Scanner read = new Scanner(System.in);

		boolean salir = false;

			while(salir !=true ){
				
				boolean verdad = false;

				do{
					

					int multiplo = (int)(Math.random()*1000);


					if (multiplo%5==0) {
					System.out.println("multiplo de 5: "+multiplo);
					verdad = true;				
					}

				}while(verdad !=true );
			
				

				System.out.println("1 para salir");
				int numero = read.nextInt();

				if (numero==1) {

					salir = true;			
				}				

			}

	}	

}