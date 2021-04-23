package Javatest;

public class StudentData implements Comparable
{
	String name,Standard;
	int Rollnum;
	StudentData(String name, String Standard, int Rollnum) 
	{
	this.name=name;
	this.Standard=Standard;
	this.Rollnum=Rollnum;
	}
	@Override
		public String toString()
		{
			return name +" " + Standard + " " + Rollnum+"\n";  
		}

	
	@Override
	 	public int compareTo(Object obj)
	 	{
		int e1 = this.Rollnum;
		StudentData sobj = (StudentData)obj;
		int e2 = sobj.Rollnum;
			
		if(e1 > e2)
			{
			return 1;
			}
				else if(e1<e2) 
				{
					return -1;
				}
				else
				{
					return 0;
				}
	 	}
}
	

