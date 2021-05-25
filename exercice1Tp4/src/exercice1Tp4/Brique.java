package exercice1Tp4;

public class Brique extends Form {

	private double largeur;
	private double hauteur;
	private double longueur;
	
	
	public Brique(Point3D pt,double dancite,double largeur,double hauteur,double longeur) {
		
		super(pt,dancite);
		this.hauteur=hauteur;
		this.largeur=largeur;
		this.longueur=longeur;
	}
	
	@Override
	public String desc() {
		return "(Brique"+super.desc()+" largeur="+largeur+" hauteur="+hauteur+"longeure"+longueur+")";
	}
}
