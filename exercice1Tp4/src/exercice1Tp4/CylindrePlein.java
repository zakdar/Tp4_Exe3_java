package exercice1Tp4;

public class CylindrePlein extends Form {

   private	double heuteur;
   private	double rayan;
   
   
public CylindrePlein(Point3D pt, double dancite, double heuteur, double rayan) {
	super(pt, dancite);
	this.heuteur = heuteur;
	this.rayan = rayan;
}
   
@Override
public String desc() {
	return "(CylindrePlein"+super.desc()+" rayan="+rayan+" hauteur="+heuteur+")";
}
 
   
   
}
