//Clase de notas para guardar las notas del alumno //

import java.util.Scanner;

public class Academico{
	static void quesearmenlospincheschingadazos(String args[]){
		Scanner s = new Scanner(System.in);
		//atributos de la clase
		String[] clase1 = new String[5];
		int[] nota1 = new int[10];

		String[] clase2 = new String[5];
		int[] nota2 = new int[10];

		String[] clase3 = new String[5];
		int[] nota3 = new int[10];

		String [] clase4 = new String[5];
		int[] nota4 = new int[10];

		String[] clase5 = new String[5];
		int[] nota5 = new int[10];

		int x=0; 
		int opcion1 = 0;
		String opcion2 = "";
    
//ingresar clases y notas de las mismas
		do {
			do {
				System.out.println("Registrar notas del alumno: ");

				System.out.println("Ingrese la clase "+ (x+1) + ": ");
				clase1[x] = s.nextLine();

				System.out.println("Ingrese la nota de esa clase "+ (x+1) + ": ");
				nota1[x] = s.nextInt();

				System.out.println("Ingrese la clase "+ (x+1) + ": ");
				clase2[x] = s.nextLine();

				System.out.println("Ingrese la nota de esa clase "+ (x+1) + ": ");
				nota2[x] = s.nextInt();
	
				System.out.println("Ingrese la clase "+ (x+1) + ": ");
				clase3[x] = s.nextLine();

				System.out.println("Ingrese la nota de esa clase "+ (x+1) + ": ");
				nota3[x] = s.nextInt();

				System.out.println("Ingrese la clase "+ (x+1) + ": ");
				clase4[x] = s.nextLine();

				System.out.println("Ingrese la nota de esa clase "+ (x+1) + ": ");
				nota4[x] = s.nextInt();

				System.out.println("Ingrese la clase "+ (x+1) + ": ");
				clase5[x] = s.nextLine();

				System.out.println("Ingrese la nota de esa clase "+ (x+1) + ": ");
				nota5[x] = s.nextInt();
				x++;

				} while(opcion1 ==1);
		
			} while(opcion1 == 1);
		
		}

	}
    


    


    
