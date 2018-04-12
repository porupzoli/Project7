package geometric.runnable;

import geometric.Cuboid;
import geometric.Cylinder;

public class Main {
	public static void main(String[] args) {
		Cylinder cylinder=new Cylinder(10, 2);
		Cuboid cuboid= new Cuboid(5, 1, 2);
		System.out.println(cylinder.hasBiggerVolumeThan(cuboid));
		System.out.println(cylinder);
		System.out.println(cuboid);
	}
}
