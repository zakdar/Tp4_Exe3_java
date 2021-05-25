package exercice1Tp4;

import java.util.ArrayList;

public class DocumentGraphique {

  private	ArrayList<Form> docs;
  
  public DocumentGraphique() {
		docs=new ArrayList<Form>();
	}
  
   public void addForm(Form f) {
	
	   docs.add(f);

}
  
  public void removeForme(int pos) {
	  
	  docs.remove(pos);
  }
  public ArrayList<Cube> getAllCubes() {

	  ArrayList<Cube> cubes = new ArrayList<Cube>();
	  for(Form var:docs) {
		  
		  if(var instanceof Cube) {
			  cubes.add((Cube)var);
		  }
	  }
	  return cubes;
}
}
