package geometric;

public class Cylinder extends Prism{
	
	private double r;
	public Cylinder(int height, double r) 
	{
		super(height);
		this.r=r;
	}
	
	public double getBaseArea() {
		return r*r*Math.PI;
	}

	public String toString() {
		return  r + " " + getHeight();
	}
	
	
	
	
	
	

}
