package exercice1Tp4;

import java.io.PrintStream;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		PrintStream o = System.out;
		//creation d'une point 
		Point3D pt= new Point3D(12,23,34);
		
		o.println(pt.toString());
		//creation d'une Brique
		Brique c = new Brique(pt,12,13,17,18);
		o.println(c.desc());
		//creation d'un Cube
		Cube c1 = new Cube(pt,12,8.7);
					
		o.println(c1.desc());
					
		//deplacement du cube 
					
		c1.deplacer(10,34,9);
		o.println(c1.desc());
		//creation d'une Brique
				Brique c3 = new Brique(pt,1,3,7,45);
				o.println(c3.desc());
				o.println("****************************************");
				
				DocumentGraphique doc=new DocumentGraphique();
				doc.addForm(c);
				doc.addForm(c1);
				doc.addForm(c3);
				ArrayList<Cube> cubes=doc.getAllCubes();
				for(Cube cbs:cubes)
				{
					o.println(cbs.desc());
				}
	}
	
	
	
	
	
}
