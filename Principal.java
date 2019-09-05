import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
	public static void main(String[] args){
		
//Inicializando todo lo que dse deba inicializar desde el principio 
		Scanner s = new Scanner(System.in);
		ArrayList<String> curso= new ArrayList<String>();
		ArrayList<String> alumnos= new ArrayList<String>();
		Academico control =  new Academico();
//Aqui terminan las 
		String NESC="";
		int decision1 = 0;
		int decision2  = 0;
		int parametro = 0;
		String grado;
		int cursos = 0;
		//Se supone que tanto Nalumnos, nombre de la escuela, cursos etc etc se van a guardar en la base de datos 
		//sin embargo todavia no se a podido conectar java con MongoDb, por lo que la parte del programa 
		//presentado es ilustrativa
		int Nalumnos = 0;
		String nombrecursos="";
		String nombrealumnos = "";

//Comienza el programa (hoy si se va a poner bueno)
		System.out.println("Desea ingresar informacion de la Escuela (0) \ningresar infomacion de solo los alumnos (1)\nConsultar inforación de los alumnos(2)");
		decision1 = s.nextInt();
		while(parametro == 0){
			System.out.println("Ingrese el nombre de la escuela " );
			NESC = s.nextLine();
			s.nextLine();
			System.out.println("Ingrese el grado " );
			grado = s.nextLine();
			System.out.println("Ingrese la cantidad de cursos");
			cursos = s.nextInt();
			System.out.println("Ingrese el nombre de dichos cursos ");
			for ( int i = 0;i < (cursos+1); i++){
				nombrecursos = s.nextLine();
				curso.add(nombrealumnos);	
				}
//El programa tiene el for para cursos y alumnos, que en este caso, rompen con el modelo vista controlador 
//La idea de todo esto es tener un metodo que guarde en la base de datos la informacion basica 
//Sin embargo no se a podido hacer que la base de datos funcione con java
//Vamos a utilizar mongoDb.Y en la siguiente version, se espera que este ya sirva y que se hayan definido los metodos
//Para guardado de datos en mongodb y tambien para hacer busquedas. 			
			System.out.println("Ingrese la cantidad de alumnos");
			Nalumnos = s.nextInt();
			for ( int i = 0;i < (Nalumnos+1); i++){
				nombrealumnos = s.nextLine();
				alumnos.add(nombrealumnos);	
				}
			
				
			System.out.println("Desea ingresar otra vez la informacion? si(1) o no (0)");	
			decision2 = s.nextInt();
			if (decision2 == 0){
				break;
				
				}
			else{
				System.out.println("ok, volvela a llenar pues, pero se mas cuidadoso al ingresar datos. El programa no sabe en que parte te confundiste!");
				System.out.println("y vas a tener que meterlo todo otra vez jaja");
				System.out.println("Solo se mas cuidadoso ;)");
				System.out.println("");
				}
			}
		
			
		
		
		s.close();
	}
	
}