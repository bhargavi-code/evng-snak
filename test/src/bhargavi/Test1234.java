package bhargavi;

import java.util.ArrayList;

public class Test1234 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(15);
		l.add(10);
		l.add(40);
		l.add(5);
		l.add(100);
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=l.size()-1;j>i;j--)
			{
				if(l.get(i)>l.get(j))
				{
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
		for(int f :l)
		{
			System.out.println(f);
		}
     }
}
