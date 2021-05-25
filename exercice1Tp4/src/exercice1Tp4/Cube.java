package exercice1Tp4;

public class Cube  extends Brique{
	
	
	public Cube(Point3D pt,double dancite,double aa) {
		super(pt,dancite,aa,aa,aa);
	}

	@Override
	public String desc() {
		return "(Cube"+super.desc()+")";
	}
}
