package com.jcg.java.mongodb;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.FindIterable;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.Document;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.types.ObjectId;
import com.mongodb.DBCursor;
import com.mongodb.DBCollection;

public class ModuloMongodb {
	
		public void informacionescuela(ArrayList<String> curso,ArrayList<String> alumnos,String grado,String escuela) {
			List<Document> documents = new ArrayList<Document>();
			String list = "";
			String list2 = "";
			for (int i=0;i<alumnos.size();i++) {
				list= list + ", "+alumnos.get(i);
			}
			
			for (int i=0;i<curso.size();i++) {
				list2= list2 + ", " +curso.get(i);
			}
			
			
			MongoClient mongoClient = MongoClients.create();
			MongoDatabase database = mongoClient.getDatabase("proyecto");
			MongoCollection<Document> collection = database.getCollection("Escuela");
			Document document = new Document("Escuela", escuela)
						.append("Grado", grado)
		               .append("Estudiantes", list)
		               .append("Cursos", list2);
			 documents.add(document);
			 collection.insertMany(documents);
			 
			 
		}
		public void Mongodbinsertar(ArrayList<Estudiante> estudiantes,String grado) { 
			List<Document> documents = new ArrayList<Document>();
			Estudiante estudiante = new Estudiante();
			MongoClient mongoClient = MongoClients.create();
			MongoDatabase database = mongoClient.getDatabase("proyecto");
			MongoCollection<Document> collection = database.getCollection("ninos");
			 for(int i=0; i<estudiantes.size();i++) {
				 estudiante = estudiantes.get(i);
				 
				 Document document = new Document("nombre",estudiante.getNombre() ) 
			               .append("edad",estudiante.getEdad() )
			               .append("Promedio de notas", estudiante.getAlimentos())
			               .append("grado",grado)
			               .append("Peso",estudiante.getPeso());
				 
				 documents.add(document);
				 
			 }
			 
			 collection.insertMany(documents);
		}
		//Busca por nombres dentro de los documentos de la base de datos para desplegar la informacion de dicho estudiante
		public String Mongodbbuscar(String nombre) {
			List<Document> documents = new ArrayList<Document>();
			BasicDBObject query = new BasicDBObject();
			Estudiante estudiante = new Estudiante();
			MongoClient mongoClient = MongoClients.create();
			MongoDatabase db = null;
			MongoCollection collection = null;
			String datos="El nino/nina " + nombre + " seleccionado tiene el siguiente historial: \n" ;
			query.put("nombre",nombre);
			   
			 db = mongoClient.getDatabase("proyecto");
			 collection = db.getCollection("ninos");
			 FindIterable<Document> docs = collection.find(query);
			 //Ciclo for para buscar todos los datos con el parametro "nombre" para crear un String con toda su informacion
			for (Document doc : docs) {
				if(nombre.equals(doc.get("nombre"))) {
					datos = datos + "\n" + "Peso : "+doc.get("Peso") +"  Notas: "+ doc.get("Promedio de notas");
					}
			}
			        	
			return datos;
			
		}
		//Despliega los nombres de todos los estudiantes para que la persona encargada pueda elegir sobre quien quiere ver su informacion
		public String MongoLista() {
			List<Document> documents = new ArrayList<Document>();
			Estudiante estudiante = new Estudiante();
			MongoClient mongoClient = MongoClients.create();
			MongoDatabase db = null;
			MongoCollection collection = null;
			String datos="";
			int i = 1;
						
			   
			 db = mongoClient.getDatabase("proyecto");
			 collection = db.getCollection("ninos");
			 FindIterable<Document> docs = collection.find();
			for (Document doc : docs) {
				datos = datos + "\n"+ i +". "+   doc.getString("nombre") ;
				i++;
			}
			        	
			return datos;
			
		}
			
}
		
		
	
		
		



