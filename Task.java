package com;
import java.util.*;
public class Task {
   synchronized public void assign() {
	   Product p1=new Product(10,"Ball");
	   Product p2=new Product(30,"Bat");
	   Product p3=new Product(20,"Stump");
	   
	   HashSet<Integer> id1=new HashSet();
	   id1.add(p1.id);
	   id1.add(p2.id);
	   id1.add(p3.id);
	   HashSet<Product> object=new HashSet();
	   object.add(p1);
	   object.add(p2);
	   object.add(p3);
	   HashMap<Integer ,Product> m1=new HashMap();
	   for(Integer ID:id1) {
		   for(Product p:object) {
			   if(ID==p.id) {
				   
				   m1.put(ID, p);
			   }
		   }
	   }
	   System.out.println(m1);
	   try {
		   Thread.sleep(1000);
	   }catch(InterruptedException e) {
		   e.printStackTrace();
	   }
	   
 }
}
