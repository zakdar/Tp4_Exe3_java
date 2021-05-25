package exercice1Tp4;

public class Form  {

     private Point3D pt;
     private double dancite;

     


	public Form(Point3D pt, double dancite) {
	
		this.pt = pt;
		this.dancite = dancite;
	}



	public Point3D getPt() {
		return pt;
	}



	public void setPt(Point3D pt) {
		this.pt = pt;
	}



	public double getDancite() {
		return dancite;
	}



	public void setDancite(double dancite) {
		this.dancite = dancite;
	} 
	
	//la methode deplacer
	
	public void deplacer(double x, double y,double z) {
		
		pt.deplacer(x,y,z);
	}
	
     public String desc() {
    	 String inf=pt.toString()+" dnacite="+dancite;
    	 return inf;
     }


}
