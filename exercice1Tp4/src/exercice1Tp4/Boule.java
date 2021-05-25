package exercice1Tp4;

public class Boule extends Form {

	private double rayan;
	
	
	public Boule(Point3D pt,double dancite,double rayan) {
		
		super(pt,dancite);
		this.rayan=rayan;	
	}
	
	
	public double getRayan() {
		return rayan;
	}
	
	public void setRayan(double rayan) {
		
		this.rayan=rayan;
	}
	
	@Override
	public String desc() {
		return "Boule("+super.desc()+" rayan="+rayan+")";
	}
	
}
