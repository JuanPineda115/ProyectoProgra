package com.jcg.java.mongodb;
// Clase de notas para guardar las notas del estudiante //
//Esta clase se realizo con el fin de realizar una comparción con los alimentos de los alumnos y que tanto influyen en su rendimiento academico. 
import java.util.Scanner;

public class Academico{
	
// Es la forma que por ahora se piensa guardar datos, sin embargo no se va a utilizar el metodo hasta que se pueda utilizar mongodb, probablemente se tenga de modificar //
	
	static void asignador(String args[]){
		Scanner s = new Scanner(System.in);
		
		// Atributos de la clase Academico // 
		
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
    
// Ingreso de Clase y Notas de estas //
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
			s.close();
		
		}

	}
    


    


    
