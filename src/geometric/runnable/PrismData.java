package geometric.runnable;

import geometric.Cylinder;
import geometric.Prism;

public class PrismData {
	
	Prism[] prismarray;
	
	
	public PrismData(int numberofElements)
	{
		super();
		prismarray=new Prism[numberofElements];
	}
	
	public int getNumberofPrims()
	{
		return prismarray.length;
	}
	
	public void setPrism(int index, Prism prism)
	{
		prismarray[index]=prism;
	}

	
	public Prism[] getPrismarray() {
		return prismarray;
	}
	
	
	public Prism getPrismByIndex(int index)
	{
		return prismarray[index];
	}
	
	
	public int getNumerOfNulls()
	{
		int counter=0;
		for(Prism prism : prismarray)
		{
			if(prism!=null)
			{
				counter++;
			}
		}
		return counter;
	}
	
	
	public double getAvgVolume()
	{
		double avg=0;
		
		for(Prism prism:prismarray)
		{
			if(prism!=null)
			{
				avg+=prism.getVolume();
				
			}
		}
		return avg/getNumerOfNulls();
	}
	
	
	public int getNumberOfCylinder()
	{
		int counter=0;
		for(Prism prism:prismarray)
		{
			if(prism instanceof Cylinder)
			{
				counter++;
			}
		}
		return counter;
	}




	

}
