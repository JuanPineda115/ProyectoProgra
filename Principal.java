import java.util.Scanner;
import java.util.ArrayList;
public class Principal{
	public static void main(String[] args){
		
//Inicializando todo lo que dse deba inicializar desde el principio 
		Scanner s = new Scanner(System.in);
		ArrayList<String> curso= new ArrayList<String>();
		ArrayList<String> alumnos= new ArrayList<String>();
		String nombreEscuela = "";
		int desicion1 = 0;
		int desicion2  = 0;
		int parametro = 0;
		String grado = "";
		int cursos = 0;
		//Se supone que tanto Nalumnos, nombre de la escuela, cursos etc etc se van a guardar en la base de datos 
		//sin embargo todavia no se a podido conectar java con MongoDb, por lo que la parte del programa 
		//presentado es ilustrativa
		int Nalumnos = 0;
		String nombrecursos="";
		String nombrealumnos = "";

//Comienza el programa (hoy si se va a poner bueno)
		System.out.println("Desea ingresar informacion de la Escuela (0), ingresar infomacion de solo los alumnos (1) o bien consultarla(2)");
		desicion1 = s.nextInt();
		while(parametro == 0){
			System.out.println("Ingrese el nombre de la escuela " );
			nombreEscuela = s.nextLine();
			System.out.println("Ingrese el grado " );
			grado = s.nextLine();
			System.out.println("Ingrese la cantidad de cursos");
			cursos = s.nextInt();
			System.out.println("Ingrese el nombre de dichos cursos ");
			for ( int i = 0;i < (cursos+1); i++){
				nombrecursos = s.nextLine();
				//Se tiene que respetar el metodo mvc, sin embargo, todavia no se a hecho el metodo para agregar cursos.La version final lo 
				//TIENE QUE TENER y lo va a tener c:
				curso.add(nombrecursos);	
				}
				
			System.out.println("Ingrese la cantidad de alumnos");
			Nalumnos = s.nextInt();
			for ( int i = 0;i < (Nalumnos+1); i++){
				nombrealumnos = s.nextLine();
			//Es lo mismo que con el  for anterior
				alumnos.add(nombrealumnos);	
				}
			
				
			System.out.println("Desea ingresar otra vez la informacion? si(1) o no (0)");	
			desicion2 = s.nextInt();
			if (desicion2 == 0){
				break;
				
				}
			else{
				System.out.println("ok, volvela a llenar pues, pero se mas cuidadoso al ingresar datos. El programa no sabe en que parte te confundiste!");
				System.out.println("y vas a tener que meterlo todo otra vez jaja");
				System.out.println("Solo se mas cuidadoso ;)");
				System.out.println("");
				}
			}
		
			
		
		
		
	}
	
}