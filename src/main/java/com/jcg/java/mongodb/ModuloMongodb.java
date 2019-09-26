package com.jcg.java.mongodb;
import java.util.List;
import java.util.ArrayList;
import com.mongodb.*;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.*;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.*;
import org.bson.Document;
import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import org.bson.types.ObjectId;
public class ModuloMongodb {
	
	
		
	
		public void informacionescuela(ArrayList<String> curso,ArrayList<String> alumnos,String grado,String escuela) {
			List<Document> documents = new ArrayList<Document>();
			List<String> list = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			for (int i=0;i<alumnos.size();i++) {
				list.add(alumnos.get(i));
			}
			
			for (int i=0;i<curso.size();i++) {
				list.add(curso.get(i));
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
		public void Mongodbinsertar(ArrayList<Estudiante> estudiantes) { 
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
			               .append("Peso",estudiante.getPeso());
				 
				 documents.add(document);
				 
			 }
			 
			 collection.insertMany(documents);
		}
		
		
		


}
