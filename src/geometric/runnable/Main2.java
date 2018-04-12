package geometric.runnable;

import geometric.Cuboid;
import geometric.Cylinder;
import geometric.Prism;

public class Main2 {
	public static void main(String[] args) {
		PrismData data = new PrismData(5);
		Prism cuboid=new Cuboid(4,2,3);
		Prism cylinder= new Cylinder(4,6);
		Cylinder cylinder2= new Cylinder(4, 3);
		
		data.setPrism(0, cuboid);
		data.setPrism(2, cylinder);
		data.setPrism(4, cylinder2);
		
		
		for(int i=0; i<data.getNumberofPrims();i++)
		{
			System.out.println(data.getPrismByIndex(i));
		}
		
		System.out.println(data.getAvgVolume());
		System.out.println(data.getNumberOfCylinder());		
	}
}
