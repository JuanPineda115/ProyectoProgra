// Clase Estudiante //
// Identifica y obtiene los datos del alumno //

public class Estudiante{
	// Atributos de la clase Estudiante //
	//Se le pedirán más datos para tener acceso a cualquier inforamción sobre el estudiante//
    private String nombre ;
    private int edad ; 
	private int alimentos ;
    private double peso ;
	
	// Metodos de la clase Estudiante // // set y get //
	//Estos métodos se realizaron con el fin de obtener y mandar la inforamción del alumno//
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public void setEdad(int edad){
		this.edad =  edad;
	}
	//Esta variable en especifico, se modificara, ya que se necesita especificar que tipo de alimentos consume constantemente//
	 public int getAlimentos(){
		 return alimentos;
	 }
	 
	 public void setAlimentos(int alimentos){
		 this.alimentos = alimentos;
	 }
	 
	 public double getPeso(){
		 return peso;
	 }
	 
	 public void setPeso(double peso){
		 this.peso = peso;
	 }

}    
