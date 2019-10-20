package hackUmass;
//package com.mongodb;
//import package.com.mongodb.* 

import java.lang.Object;
import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoCollection; 
import com.mongodb.client.MongoDatabase;  
import java.util.Iterator;
import java.util.List;

import org.bson.Document; 
import com.mongodb.client.MongoDatabase; 
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress; 
 
public class mockDataCreation { 
   
   public static void main( String args[] ) {  
       
      // Creating a Mongo client  
      //MongoClient mongo = new MongoClient( "cluster0-znz6n.mongodb.net/test" , 27017); 
	   //ServerAddress s = new ServerAddress("localhost", 27017);
	   MongoClientURI mongoClientURI = new MongoClientURI("mongodb://[eRisas:chickennuggets20@]cluster0-znz6n.mongodb.net/test");
	   //"http://cluster0-znz6n.mongodb.net/test", 27017
	//   List<MongoCredential> c = null;
	   MongoClient mongo = new MongoClient(mongoClientURI);

      // Creating Credentials 
      MongoCredential credential;
      credential = MongoCredential.createCredential("eRisas", "test", 
         "chickennuggets20".toCharArray());  
      System.out.println("Connected to the database successfully");  
      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("test");   
//       
//      // Retrieving a collection 
//      MongoCollection<Document> collection = database.getCollection("sampleCollection");
//      System.out.println("Collection sampleCollection selected successfully"); 
//
//      // Getting the iterable object 
//      FindIterable<Document> iterDoc = collection.find(); 
//      int i = 1; 
//
//      // Getting the iterator 
//      Iterator it = iterDoc.iterator(); 
//    
//      while (it.hasNext()) {  
//         System.out.println(it.next());  
//      i++; 
//      }
   } 
}
//Node a = new Node((int)(Math.random()*(9)) + 1);
//Node b = new Node((int)(Math.random()*(9)) + 1);
//Node c = new Node((int)(Math.random()*(9)) + 1);
//Node d = new Node((int)(Math.random()*(9)) + 1);
//Node e = new Node((int)(Math.random()*(9)) + 1);
//Node f = new Node((int)(Math.random()*(9)) + 1);
//Node g = new Node((int)(Math.random()*(9)) + 1);
//Node h = new Node((int)(Math.random()*(9)) + 1);
//Node i = new Node((int)(Math.random()*(9)) + 1);
//Node j = new Node((int)(Math.random()*(9)) + 1);
//Node k = new Node((int)(Math.random()*(9)) + 1);
//Node l = new Node((int)(Math.random()*(9)) + 1);
//Node m = new Node((int)(Math.random()*(9)) + 1);
//Node n = new Node((int)(Math.random()*(9)) + 1);
//Node o = new Node((int)(Math.random()*(9)) + 1);
////Node p = new Node((int)(Math.random()*(99+2)));
////System.out.println(a.key);
//a.left = b;
//a.right = c;
//b.left = d;
//b.right = e;
//c.left = f;
//c.right = g;
//d.left = h;
//d.right = i;
//e.left=j;
//e.right=k;
//f.left=l;
//f.right = m;
//g.left = n;
//g.right = o;
//
////int count = 0;
//System.out.println("final result is: " + h(a));
//int temp = h.key;
//h.key = j.key;
//j.key = temp;
//
//System.out.println("final result is: " + h(a));
//temp = k.key;
//k.key = o.key;
//o.key = temp;
//
//System.out.println("final result is: " + h(a));
//temp = l.key;
//l.key = n.key;
//n.key = temp;
//
//System.out.println("final result is: " + h(a));
////while(true) {
////	Node n = new Node();
////}
////int d = 8;
////int[] array = new int[d];
////for(int i = 0; i < d; i++) {
////	array[i] = (int)(Math.random()*(100+1));
////}
////for(int i = 0; i < d; i++) {
////	
////}
