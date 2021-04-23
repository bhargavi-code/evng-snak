package bom;

public class Test123 
{
	public static void main(String[] args) 
	{
		String str = "Mahabharat";
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			int count =0;
			for(int j=0;j<str.length();j++)
			{
				char d = str.charAt(j);
				if(c==d && i>j)
				{
					break;
				}
				if(c==d)
				{
					count++;
			    }
				if(count==1)
				{
					System.out.println(c+"present"+count+"time");
				}
		}
	}
	}
}
	
